package com.asiainfo.crm.cm.ln.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmGroupAccountingValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmGroupInfoValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;

public interface ICmLnGroupSV {

	/**   
	 * @Function saveGroupMemberExt
	 * @Description 保存集团成员扩展表
	 *
	 * @param cmxGroupMemberValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 1, 2012 11:45:09 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveGroupMemberExt(IBOLnCmxGroupMemberValue[] cmxGroupMemberValues) throws Exception;


	/**   
	 * @Function queryLnGroupMemberExt
	 * @Description 根据成员编号查询集团成员扩展信息
	 *
	 * @param relCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 1, 2012 11:45:20 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmxGroupMemberValue queryLnGroupMemberExt(long relCustId) throws Exception;

	/**   
	 * @Function queryGroupMembersByGroupId
	 * @Description 根据客户编号查询集团成员
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 1, 2012 4:51:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IGroupMemberValue[] queryGroupMembersById(long custId, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupMemberCount
	 * @Description 根据客户编号查询集团成员数量
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 1, 2012 4:58:25 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryGroupMemberCount(long custId) throws Exception;
	
	/**   
	 * @Function queryGroupAccountingById
	 * @Description 根据客户编号查询会计信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 1, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBoCmGroupAccountingValue queryGroupAccountingById(long custId) throws Exception;
	
	/**   
	 * @Function saveGroupCustExt
	 * @Description 保存集团扩展信息
	 *
	 * @param cmxGroupCustValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 6, 2012 9:11:13 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveGroupCustExt(IBOLnCmxGroupCustValue[] cmxGroupCustValues) throws Exception;

	/**
	 * 保存单个cmx_group_customer数据
	 *
	 * @param cmxGroupCustValue
	 * @throws Exception
	 */
	void saveCmxGroupCustomer(IBOLnCmxGroupCustValue cmxGroupCustValue) throws Exception;

	/**   
	 * @Function queryGroupCustExtById
	 * @Description 查询集团扩展信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Sep 6, 2012 9:11:23 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 6, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOLnCmxGroupCustValue queryGroupCustExtById(long custId)throws Exception;

	public DataContainerInterface[] queryLowerGroupInfosByCustId(long custId, int startNum, int endNum)throws Exception;
	
	public int queryLowerGroupInfosCountByCustId(long custId)throws Exception;
	
	public ICustomerValue queryParentGroupInfoByCustid(long custId)throws Exception;

	/**
	 * 根据客户编码查询集团客户信息：包含集团客户扩展表信息
	 * @param condition
	 * @return
	 * @throws Exception
	 */
	public IBOLnCmGroupInfoValue[] queryGroupInfos(DataContainer condition, int startNum, int endNum) throws Exception;
	
	public IBOLnCmxGroupCustValue queryGroupCustExtByIdAndLog(long custId) throws Exception;
	
}
