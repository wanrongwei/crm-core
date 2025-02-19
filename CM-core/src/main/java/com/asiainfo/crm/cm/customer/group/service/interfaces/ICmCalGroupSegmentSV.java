package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: ICmCalGroupSegmentSV 
 * @Description: 
 *
 * @version: v1.0.0
 * @author: zhuyy
 * @date:  2014-5-20 下午02:27:13
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-5-20     zhuyy          v1.0.0             修改原因
 */
public interface ICmCalGroupSegmentSV {

	/**
	 * 
	 * @Function: queryGroupDifferData
	 * @Description: 查询集团组织层级变更差异数
	 * 
	 * @param regionId
	 * @param tenantId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-5-20 下午02:27:36
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-5-20     zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryGroupDifferData(String tenantId, String regionId) throws Exception;

	/**
	 * 
	 * @Function: queryNewGroupCustomerData
	 * @Description:   查询新增集团客户数据(KOB同步过来，不入任何层级)
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-5-20 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-5-20     zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryNewGroupCustomerData(String tenantId, String regionId) throws Exception;

	/**
	 * 
	 * @Function: queryNewGroupCustomerData
	 * @Description:   更新重新计算后的差异数据状态
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-5-20 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-5-20     zhuyy         v1.0.0                                   修改原因
	 */
	public void saveDifferData(BOCmGroupOrgDifferBean differBean) throws Exception;

	/**
	 * 
	 * @Function: saveGroupSegmentRela
	 * @Description:  更新保存集团以及子集团的客户细分
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-5-20 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-5-20     zhuyy         v1.0.0                                   修改原因
	 */
	public void saveGroupSegmentRela(long parentCustId, long segmentId, String tenantId) throws Exception;

	/**
	 * 
	 * @Function: queryNewGroup
	 * @Description:  查询当天新增的集团客户
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-10-15 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-10-15      zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryNewGroup(String tenantId) throws Exception;

	/**
	 * 
	 * @Function: queryGroupAddStructData
	 * @Description:  查询已经存在的集团加入某个层级
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-10-16 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-10-16      zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryGroupAddStructData(String tenantId) throws Exception;

	/**
	 * 
	 * @Function: querySegmentByCustId
	 * @Description:  根据cust_ID查询对应的细分
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-11-4 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-11-4      zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] querySegmentByCustId(String tenantId, String custId) throws Exception;

	/**
	 * 
	 * @Function queryGroupDifferDataByCustId
	 * @Description 根据custId查询当前客户是否加入某个层级或者变更为某个层级的根节点
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-1-10 下午4:39:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-1-10     yangjh           v1.0.0               修改原因<br>
	 */
	public long queryGroupDifferDataByCustId(long custId) throws Exception;

	/**
	 * 
	 * @Function: queryNewGroup
	 * @Description:  查询当天新增的集团客户
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-10-15 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-10-15      zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryNewGroupForFY(String tenantId, int mod, int value, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function: queryNewGroup
	 * @Description:  查询当天新增的集团客户
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-10-15 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-10-15      zhuyy         v1.0.0                                   修改原因
	 */
	public int queryNewGroupForFYCount(String tenantId, int mod, int value) throws Exception;

	/**
	 * 
	 * @Function: queryGroupAddStructData
	 * @Description:  查询已经存在的集团加入某个层级
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-10-16 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-10-16      zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryGroupAddStructDataForFY(String tenantId, int mode, int value, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function: queryGroupAddStructData
	 * @Description:  查询已经存在的集团加入某个层级
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-10-16 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-10-16      zhuyy         v1.0.0                                   修改原因
	 */
	public int queryGroupAddStructDataForFYCount(String tenantId, int mode, int value) throws Exception;

	/**
	 * 计算细分和分配默认客户经理
	 * @Function calSegmentAndAssignMgr
	 * @Description 
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-6 上午11:55:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-6     yangjh           v1.0.0               修改原因<br>
	 */
	public void calSegmentAndAssignMgr(long custId) throws Exception;
	/**
	 * 处理层级变更
	 * @Function saveCustOrg
	 * @Description 
	 *
	 * @param custId
	 * @param upCustId
	 * @param downCustId
	 * @param upCustServiceId
	 * @param downCustName
	 * @param isBankruptcyRecovery
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-6 上午11:56:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-6     yangjh           v1.0.0               修改原因<br>
	 */
	public void saveCustOrg(long custId, long upCustId, long downCustId, String upCustServiceId, String downCustName, boolean isBankruptcyRecovery) throws Exception;
	/**
	 * 继承细分和客户经理
	 * @Function inheritCustSegmentAndMgr
	 * @Description 
	 *
	 * @param segmentID
	 * @param custId
	 * @param strMgrCustId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-11 下午3:31:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-11     yangjh           v1.0.0               修改原因<br>
	 */
	public void inheritCustSegmentAndMgr(String segmentID, long custId, String strMgrCustId) throws Exception;
	
	/**
	 * 转移数据
	 * @Function trnasData
	 * @Description 
	 *
	 * @param oldTableName
	 * @param newTableName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-4-21 上午11:25:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-4-21     yangjh           v1.0.0               修改原因<br>
	 */
	public void transData(String oldTableName, String newTableName) throws Exception;

	/**
	 * 保存集团组织结构差异
	 * @param deptId
	 * @param parentCustId
	 * @param custId
	 * @param custServiceId
	 * @param oldParentCustId
	 * @throws Exception
	 */
	void saveDifferData(long deptId, long parentCustId, long custId, String custServiceId, long oldParentCustId) throws Exception;

	/**
	 * 层级同步billing
	 *
	 * @param orgStructValue
	 * @param needAddFlag
	 * @throws Exception
	 */
	void syncHierarchyInfoToBilling(BOCmGroupOrgStructBean orgStructValue, boolean needAddFlag) throws Exception;

	/**
	 * 判断新增子公司是否存在子级,将子公司的所有子节点cust_id全部修改为根节点的cust_id
	 *
	 * @param orgStructValue
	 * @throws Exception
	 */
	void batchUpdateSubCustId(BOCmGroupOrgStructBean orgStructValue) throws Exception;
}
