package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmManagerValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmMgrOperRelValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName ICmManagerSV
 * @Description 客户经理服务类
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-5-23 下午3:36:32
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmManagerSV {

	/**   
	 * 根据客户经理编号查询客户经理信息
	 * @Function queryManagerById
	 * @Description 
	 *
	 * @param managerId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午4:12:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmManagerValue queryManagerById(long managerId) throws Exception;

	/**   
	 * @Function queryManagerOrganizeByMgrId
	 * @Description 
	 *
	 * @param managerId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-29 下午5:17:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-29     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmOrganizeValue queryManagerOrganizeByMgrId(long managerId) throws Exception;

	/**   
	 * 根据操作员工号查询客户经理信息
	 * @Function queryManagerByOperCode
	 * @Description 
	 *
	 * @param operCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-25 上午10:59:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-25     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmManagerValue queryManagerByOperCode(String operCode) throws Exception;

	/**   
	 * 根据操作员编号查询客户经理信息
	 * @Function queryManagerByOperId
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午4:49:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmManagerValue queryManagerByOperId(long operId) throws Exception;

	/**   
	 * 根据指定格式的查询条件查询客户经理信息
	 * @Function queryManagers
	 * @Description 
	 *
	 * @param criteria 指定格式的查询条件，默认支持XML格式
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午4:32:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryManagers(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 根据指定格式的查询条件查询客户经理信息
	 * @Function queryManagerCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午4:33:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryManagerCount(String criteria) throws Exception;

	/**   
	 * 批量查询客户经理信息
	 * @Function queryManagersByIds
	 * @Description 
	 *
	 * @param managerIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午4:34:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryManagersByIds(long[] managerIds) throws Exception;

	/**   
	 * 根据客户经理编号查询客户经理与操作员关系信息
	 * 
	 * @Function queryMgrOperRelByManagerId
	 * @Description 
	 *
	 * @param managerId 客户经理编号
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-2 下午9:08:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-2     huzq           v1.0.0               修改原因<br>
	 */
	public IBOCmMgrOperRelValue queryMgrOperRelByManagerId(long managerId) throws Exception;

	/**   
	 * 判断给定的客户经理编号与给定的操作员编号是否是同一个客户经理
	 * 
	 * @Function isSameManager
	 * @Description 
	 *
	 * @param managerId 客户经理编号
	 * @param operId 操作员编号
	 * @return 如果是同一个客户经理返回true，否则返回false
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-4 下午4:12:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-4     huzq           v1.0.0               修改原因<br>
	 */
	public boolean isSameManager(long managerId, long operId) throws Exception;
	
	/**   
	 * @Function queryGroupMainManager
	 * @Description search group main manager
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-12 下午4:28:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-12     shitian           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue queryGroupMainManager(long custId)throws Exception;
}
