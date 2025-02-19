package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: ICmCalGroupSegmentDAO 
 * @Description: 查询集团组织数据   
 *
 * @version: v1.0.0
 * @author: zhuyy
 * @date:  2014-5-20 上午10:53:14
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-5-20     zhuyy          v1.0.0             修改原因
 */
public interface ICmCalGroupSegmentDAO {
	
	public DataContainer[] queryGroupDifferData(String tenantId,String regionId)throws Exception;
	
	public DataContainer[] queryNewGroupCustomerData(String tenantId,String regionId)throws Exception;
	
	public void saveDifferData(BOCmGroupOrgDifferBean differBean) throws Exception;
	
	public void saveGroupSegmentRela(long parentCustId, long segmentId, String tenantId) throws Exception ;
	
	public DataContainer[] queryNewGroup(String tenantId) throws Exception;
	
	public DataContainer[] queryGroupAddStructData(String tenantId) throws Exception;
	
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
	public long queryGroupDifferDataByCustId(long custId)throws Exception;
}
