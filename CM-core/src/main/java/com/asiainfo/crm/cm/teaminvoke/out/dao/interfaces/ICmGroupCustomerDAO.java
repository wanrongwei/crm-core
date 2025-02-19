/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.out.dao.interfaces;

import java.rmi.RemoteException;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;



/**   
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * 
 * @ClassName: ICmGrouCustomerDAO.java
 * @Description: 该类实现对集团客户基础信息和扩展属性的操作功能。
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Dec 21, 2010 9:13:30 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Dec 21, 2010		huzq2           v1.0.0               修改原因
 */

public interface ICmGroupCustomerDAO {

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 根据指定条件查询集团客户数量
	 *
	 * @param dataContainer
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:24:31 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupCustomerCount(DataContainerInterface dataContainer) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 根据指定条件查询集团客户
	 *
	 * @param dataContainer
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:25:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustomerValue[] queryGroupCustomers(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception;

	
	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID（GROUP_ID）检索集团信息
	*
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 11, 2011 2:03:56 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 11, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue  queryGroupCustomerByGroupId(long groupId )throws Exception;

	public IBOCmGroupManagerValue queryGroupCustMgrRel(long groupCustId)throws Exception;

	public com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue queryGroupCustInfoByCustId(long groupCustId)throws Exception;
	/**
	 * 查询信用度登记信息及记录
	 * @param serviceNum
	 * @param userId
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public IBOCmUserSpeuserMainValue[] queryCreditByServiceNum(
			String serviceNum,int type)throws Exception;
	/**
	 * 
	 * @param custName
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOCmGroupCustomerValue[] queryGroupCustInfoByCustName(String custName)throws Exception, RemoteException;
	/**
	 * 
	 * @param sn
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOCmGroupMemberValue queryGroupMemInfoBySn(String sn)throws Exception, RemoteException;

	public IBOCmGroupContactValue[] queryGroupContractByGroupCustId(long custId)throws Exception, RemoteException;
	/**   
	 * @Function queryCmBillCustomize
	 * @Description 查询特殊名单信息 CM_BILL_CUSTOMIZE
	 *
	 * @param custValue
	 * @param custValue
	 * @param custValue
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-17     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmBillCustomizeValue[] queryCmBillCustomize(long customizeId,long custId,long userId,long acctId)throws Exception;
}
