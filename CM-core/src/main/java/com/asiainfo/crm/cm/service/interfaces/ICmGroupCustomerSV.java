package com.asiainfo.crm.cm.service.interfaces;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupSegmentAttrRelaValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmSegMgrGroupRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmSegmentAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupSegmentValue;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmGroupApprovalValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupCustAndExtraInfoValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOCmGroupCustomerAuditValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * 
 * @ClassName: ICmGrouCustomerSV.java
 * @Description: 该类主要实现对集团客户基本信息、集团客户扩展属性、集团客户附属信息、集团客户客户经理和集团客户信息化信息等的增删改查等操作。
 * 
 * @version: v1.0.0
 * @author: huzq2
 * @date: Dec 16, 2010 5:25:55 PM
 * 
 * Modification History: 
 * Date 		Author 		Version 	Description
 * ---------------------------------------------------------
 * Dec 16, 2010 huzq2 		v1.0.0 		创建
 */
public interface ICmGroupCustomerSV {

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据groupCustId查询集团信息
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 28, 2010 3:44:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 28, 2010     huzq2           v1.0.0               修改原因
	 */
	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoById(long groupCustId) throws Exception, RemoteException;

	public IBOCmGroupManagerValue queryGroupCustMgrRel(long groupCustId) throws Exception, RemoteException;

	public com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue queryGroupCustInfoByCustId(long groupCustId) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据groupId查询集团信息
	*
	* @param groupId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 17, 2011 3:39:34 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 17, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByGroupId(long groupId) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据集团ID（GROUP_ID）检索集团信息
	*
	* @param groupId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 11, 2011 2:06:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 11, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue queryGroupCustomerByGroupId(long groupId) throws Exception, RemoteException;

	public IBOCmUserSpeuserMainValue[] queryCreditByServiceNum(String serviceNum, int type) throws Exception, RemoteException;

	public IBOCmGroupCustomerValue[] queryGroupCustInfoByCustName(String string) throws Exception, RemoteException;

	public IBOCmGroupMemberValue queryGroupMemInfoBySn(String string) throws Exception, RemoteException;

	public IBOCmGroupContactValue[] queryGroupContractByGroupCustId(long custId) throws Exception, RemoteException;

	/**   
	 * @Function queryGroupCustByBillId
	 * @Description 根据集团成员手机号码查询集团信息（网内成员）
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 8, 2012 7:05:15 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerValue queryGroupCustByBillId(String billId) throws Exception;

	/**   
	 * @Function queryGroupByKeyBillId
	 * @Description 根据集团主要联系人手机号码查询集团客户信息
	 *
	 * @param billId
	 * @param password
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 9:28:56 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryGroupByKeyBillId(String billId, String password, int LoginFlag) throws Exception;

	/**   
	 * @Function queryGroupCustByKeyBillId
	 * @Description 根据集团主要联系人手机号码查询集团客户信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 9:26:56 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryGroupCustByKeyBillId(String billId) throws Exception;

	/**   
	 * @Function queryManagerById
	 * @Description 根据客户经理编号查询客户经理
	 *
	 * @param managerId 必填
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 10:28:01 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryManagerById(long managerId) throws Exception;

	/**   
	 * @Function queryAuditValue
	 * @Description 根据审核编号查询审核的集团信息
	 *
	 * @param audtId 必填
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 23, 2012 10:28:01 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerAuditValue[] queryAuditValue(long auditId, long custId, long auditStatus, long managerId, long auditType, long operType, int start, int end)
			throws Exception;

	/**   
	 * @Function queryAuditValueCount
	 * @Description 根据审核编号查询审核的集团信息总记录数
	 *
	 * @param audtId 必填
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 23, 2012 10:28:01 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryAuditValueCount(long auditId, long custId, long auditStatus, long managerId, long auditType, long operType) throws Exception;

	/**   
	 * @Function queryAuditValueCount
	 * @Description 查询审核的集团信息总记录数
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 23, 2012 10:28:01 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public int queryAuditValueCount(DataContainer dt) throws Exception;

	/**   
	 * @Function queryAuditValue
	 * @Description 查询审核的集团信息
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 23, 2012 10:28:01 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerAuditValue[] queryAuditValue(DataContainer dt, int start, int end) throws Exception;

	/**   
	 * @Function saveGroupMember
	 * @Description 
	 *
	 * @param groupMemberValues
	 * @param operType 1:add 2:modify 3:delete
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午7:36:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public void saveGroupMember(IBOCmGroupMemberValue[] groupMemberValues, int operType) throws Exception;

	/**   
	 * @Function saveGroupOrganize
	 * @Description 
	 *
	 * @param groupOrgStructValue
	 * @param operType 1:add 2:modify 3:delete
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:09:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public long saveGroupOrganize(ICustOrganizeValue groupOrgStructValue, int operType) throws Exception;

	/**   
	 * @Function queryGroupOrganizeByDeptId
	 * @Description 
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:11:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryGroupOrganizeByDeptId(long deptId) throws Exception;

	/**   
	 * @Function queryGroupOrganizesById
	 * @Description 
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:13:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryGroupOrganizesById(long groupCustId, long parentDeptId, int start, int end) throws Exception;

	/**   
	 * @Function queryGroupOrganizesCountById
	 * @Description 
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:13:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public int queryGroupOrganizesCountById(long groupCustId, long parentDeptId) throws Exception;

	/**   
	 * @Function queryGroupTopOrganize
	 * @Description 查询集团一级部门
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 6, 2013 10:00:50 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 6, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryGroupTopOrganize(long groupCustId) throws Exception;

	/**   
	 * @Function querySegmentAttrById
	 * @Description 
	 *
	 * @param segmentAttrId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 10, 2014 5:17:06 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 10, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmSegmentAttrValue querySegmentAttrById(long segmentAttrId) throws Exception;

	/**   
	 * @Function querySegmentAttrValuesByCustType
	 * @Description 
	 *
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 11, 2014 3:18:11 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 11, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmSegmentAttrValue[] querySegmentAttrValuesByCustType(int custType) throws Exception;

	/**   
	 * @Function queryGroupSegmentAttrRelaValues
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 10, 2014 5:17:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 10, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupSegmentAttrRelaValue[] queryGroupSegmentAttrRelaValues(long custId) throws Exception;

	/**   
	 * @Function queryGroupSegmentAttrRela
	 * @Description 
	 *
	 * @param custId
	 * @param segmentAttrId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 12, 2014 4:18:18 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 12, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupSegmentAttrRelaValue queryGroupSegmentAttrRela(long custId, long segmentAttrId) throws Exception;

	/**   
	 * @Function saveGroupSegmentAttrRela
	 * @Description 
	 *
	 * @param groupSegmentAttrRelaValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 11, 2014 3:25:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 11, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public void saveGroupSegmentAttrRela(IBOCmGroupSegmentAttrRelaValue groupSegmentAttrRelaValue) throws Exception;

	/**   
	 * @Function queryGroupSegments
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 10, 2014 5:36:17 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 10, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IQBOCmGroupSegmentValue[] queryGroupSegments(long custId) throws Exception;

	/**   
	 * @Function queryGroupCustAttrsByGroupId
	 * @Description 
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 11, 2014 4:19:27 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 11, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustAttrValue[] queryGroupCustAttrsByGroupId(long groupCustId) throws Exception;

	/**   
	 * @Function saveGroupCustAttr
	 * @Description 
	 *
	 * @param cmGroupCustAttr
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 11, 2014 4:19:30 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 11, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public void saveGroupCustAttr(IBOCmGroupCustAttrValue cmGroupCustAttr) throws Exception;

	/**   
	 * @Function saveGroupCustAttr
	 * @Description 
	 *
	 * @param cmGroupCustAttrs
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 12, 2014 9:34:50 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 12, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public void saveGroupCustAttr(IBOCmGroupCustAttrValue[] cmGroupCustAttrs) throws Exception;

	/**   
	 * @Function queryGroupCustAttr
	 * @Description 
	 *
	 * @param custId
	 * @param attrCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 14, 2014 11:28:27 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustAttrValue queryGroupCustAttr(long custId, String attrCode) throws Exception;

	/**   
	 * @Function queryGroupInheritableSegment
	 * @Description 
	 *
	 * @param custId
	 * @param segments
	 * @param result
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 14, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryGroupInheritableSegment(long custId, List segments, Map result) throws Exception;

	/**   
	 * @Function saveGroupRelIndustry
	 * @Description 
	 *
	 * @param cmGroupRelIndustry
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Feb 14, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public void saveGroupRelIndustry(IBOCmGroupRelIndustryValue[] cmGroupRelIndustry) throws Exception;

	/**   
	 * @Function queryIndustry
	 * @Description 
	 *
	 * @param relId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Feb 14, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupRelIndustryValue queryIndustry(long relId) throws Exception;

	/**   
	 * @Function queryOrgIdBySegmentZipCode
	 * @Description 
	 *
	 * @param segmentId
	 * @param zipCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Feb 14, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmSegMgrGroupRelValue queryOrgIdBySegmentZipCode(long segmentId, long zipCode) throws Exception;

	/**   
	 * @Function queryCmGroupApproval
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 16, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 16, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupApprovalValue[] queryCmGroupApproval(String xmlCondition, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function saveGroupApproval
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 16, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 16, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveGroupApproval(String custId, String currentInfo, String changeInfo, String resource, String psType, int step, String approver, String workFlowId,
			String taskId, String opId, String orgId, String zipCode, String rootCustId, String remarks) throws Exception;

	/**   
	 * @Function queryGroupApprovalById
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 18, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 18, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupApprovalValue queryGroupApprovalById(long approverId) throws Exception;

	/**   
	 * @Function saveGroupApproval
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 18, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 18, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveGroupApproval(IBOCmGroupApprovalValue value) throws Exception;

	/**   
	 * @Function saveManager
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 22, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 22, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveManager(long custId, long managerId) throws Exception;

	/**   
	 * @Function CmStartGroupSegmentWorkFlow
	 * @Description 
	 *
	 * @param 
	 * IBOCmGroupApprovalValue value中以下字段为必传
	 * CUST_ID，CURRENT_INFO，APPLY_CHANGE_INFO，RESOURCE，PS_TYPE,OP_ID,ORG_ID
	 * 另外前后审批客户经理必传（firstTSM，secondTSM），zipCode必传,总共10个字段
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 22, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 22, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void CmStartGroupSegmentWorkFlow(IBOCmGroupApprovalValue value, String firstTSM, String secondTSM, String zipCode, String remarks) throws Exception;

	/**   
	 * @Function queryManagerId
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 23, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 23, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public long queryManagerId(long custId) throws Exception;

	/**   
	 * @Function queryApprovalById
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 23, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 24, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupApprovalValue queryApprovalById(long approverId) throws Exception;

	/**   
	 * @Function CmStartGroupManagerWorkFlow
	 * @Description 
	 *
	 * @param 
	 * value中包括以下字段（custId，currentInfo，changeInfo，psType，approver，opId，orgId,rootCustId）
	 * 且都是必传
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 23, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 24, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void CmStartGroupManagerWorkFlow(IBOCmGroupApprovalValue value) throws Exception;

	/**   
	 * @Function dealGroupCustApproval
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 26, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 26, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void dealGroupCustApproval(IBOCmGroupApprovalValue value) throws Exception;

	/**   
	 * @Function dealGroupCustApproval
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 26, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 26, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void dealGroupCustApprovalNext(IBOCmGroupApprovalValue value, long custId, long groupCode) throws Exception;

	/**   
	 * @Function dealGroupCustApproval
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 26, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 26, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryGroupCustomerByCVR(String cvr) throws Exception;

	/**
	 * 
	 * @Function querySegMgrGroupRelByGroupCode
	 * @Description 
	 *
	 * @param groupCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-29 上午10:12:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-29     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmSegMgrGroupRelValue querySegMgrGroupRelByGroupCode(String groupCode) throws Exception;

	/**
	 * 
	 * @Function queryGroupOrgStructByRelCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-29 上午11:01:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-29     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupOrgStructValue queryGroupOrgStructByRelCustId(String custId) throws Exception;

	/**   
	 * @Function queryGroupcustomerByKOB
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 09 30, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 30, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustomerValue queryGroupcustomerByKOB(String kob) throws Exception;

	/**
	 * 
	 * @Function getSAOrMAManagerInfo
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-1 下午3:14:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-1     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupManagerValue[] getSAOrMAManagerInfo(String custId, int start, int end) throws Exception;

	/**   
	 * @Function queryCustomerByKobNumber
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 09 30, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 30, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByKobNumber(String kobNumber) throws Exception;

	/**   
	 * @Function queryCustValueByCVR
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 09 30, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 09 30, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public IVOCustValue queryCustValueByCVR(String cvr) throws Exception;

	/**   
	 * @Function queryCustValueByCVR
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun	
	 * @date 10 08, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 10 08, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryCmGroupApprovalCount(String xmlCondition) throws Exception;

	/**
	 * 集团客户权限控制
	 * @param xmlCondition
	 * @return
	 * @throws Exception
	 */
	public boolean queryGroupAccess(long custId) throws Exception;

	/**   
	 * @Function validateApproval
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun	
	 * @date 10 20, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 10 20, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public boolean validateApproval(long rootCustId, long approverId, long psType) throws Exception;

	/**   
	 * @Function sendSegmentToBilling
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun	
	 * @date 10 20, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 10 20, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void sendSegmentToBilling(long custId, long segmentId) throws Exception;

	/**   
	 * @Function saveGroupSegmentRelaInfo
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun	
	 * @date 10 20, 2014 11:40:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 10 20, 2014     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveGroupSegmentRelaInfo(long rootCustId, long custId, long segmentId, long resource, long groupCode) throws Exception;

	/**
	 * 根据集团客户Id查询集团成员
	 * @param custId
	 * @throws Exception
	 */
	public IBOCmGroupMemberValue[] queryGroupMemberByCustId(long custId) throws Exception;

	/**   
	 * @Function inheritGroupSegment
	 * @Description 集团客户细分层级继承（没有任何逻辑，全部继承，针对整个层级全是新客户）
	 *
	 * @param rootCustId
	 * @param segmentId
	 * @param managerId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-4 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-4     shitian             v1.0.0               修改原因<br>
	 */
	public void inheritGroupSegment(long rootCustId, long segmentId, long managerId) throws Exception;

	/**   
	 * @Function queryCustValuesByCVR
	 * @Description 根据CVR查询所有集团客户信息
	 *
	 * @param  cvr
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-12-15 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-15     zhuyy             v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustValuesByCVR(String cvr) throws Exception;

	/**   
	 * @Function queryGroupMemberByCustId
	 * @Description 查询集团网内网外成员信息
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-12-22 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-22     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmGroupMemberValue[] queryGroupMemberByCustId(long custId, long memberCustId, String memberName, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function queryGroupMemberCountByCustId
	 * @Description 查询集团网内网外成员信息的数量
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-12-22 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-22     huangqun             v1.0.0               修改原因<br>
	 */
	public int queryGroupMemberCountByCustId(long custId, long memberCustId, String memberName) throws Exception;

	/**   
	 * @Function queryCustForUser
	 * @Description 查询集团员工和集团客户
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-04-01 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-04-01     huangqun             v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCustForUser(long custId, long memberCustId, String custName, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function queryCustForUserCount
	 * @Description 查询集团员工和集团客户数量
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-04-01 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-04-01     huangqun             v1.0.0               修改原因<br>
	 */
	public int queryCustForUserCount(long custId, long memberCustId, String custName) throws Exception;

	/**   
	 * @Function queryCustOrgainzedInfo
	 * @Description  查询部门
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-06-01 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-06-01     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmGroupOrgStructValue[] queryCustOrgainzedInfo(long custId, int deptType, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function queryCustOrgainzedInfoCount
	 * @Description  查询部门数量
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-06-01 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-06-01     huangqun             v1.0.0               修改原因<br>
	 */
	public int queryCustOrgainzedInfoCount(long custId, int deptType) throws Exception;

	/**   
	 * @Function queryIfCustomerManager
	 * @Description  判断当前的操作员是不是该客户的客户经理
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-07-08 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-07-08     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean queryIfCustomerManager(long custId) throws Exception;

	/**   
	 * @Function queryFormerApprovalOpinion
	 * @Description 查询前一个细分审批的审批意见
	 *
	 * @param  
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-07-13 下午2:50:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-07-13     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmGroupApprovalValue queryFormerApprovalOpinion(String wkFlowId) throws Exception;

	/**   
	 * @Function validateDuplicateApproval
	 * @Description 校验集团是否有重复的审批工单
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-25 下午5:37:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-25     shitian             v1.0.0               修改原因<br>
	 */
	public void validateDuplicateApproval(long custId) throws Exception;
	
	/**   
	 * @Function queryCmGroupApproval
	 * @Description 
	 *
	 * @param dataContainer
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-31 下午5:09:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-31     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmGroupApprovalValue[] queryCmGroupApproval(DataContainerInterface dataContainer) throws Exception;
	
	/**
	 * 
	 * @Function queryCmGroupByCvrAndName
	 * @Description 
	 *
	 * @param cvr
	 * @param name
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-12-30 下午12:14:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-30     yangjh           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCmGroupByCvrAndName(String cvr,String name)throws Exception;
	
	
}