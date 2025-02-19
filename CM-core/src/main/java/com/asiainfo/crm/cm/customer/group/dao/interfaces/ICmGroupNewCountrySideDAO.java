package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.common.ivalues.IBOCmMapRegionTreeValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmRegionGroupInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOSignCoverCountValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOTownTypeCountValue;

public interface ICmGroupNewCountrySideDAO
{
	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 根据区域编号检索行政区域信息
	*
	* @param locationId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Feb 24, 2011 7:40:14 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 24, 2011     admin           v1.0.0               修改原因
	*/
	public IBOCmMapRegionTreeValue queryMapRegionTreeByLocationId(long locationId) throws Exception;

	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 根据上级区域编号检索行政区域信息
	*
	* @param parentLocationId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Feb 24, 2011 7:40:45 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 24, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmMapRegionTreeValue[] queryMapRegionTreesByParentLocationId(long parentLocationId) throws Exception;

	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
 	* @Description: 根据上级区域编号检索行政区域信息数量
	*
	* @param parentLocationId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Feb 28, 2011 7:01:51 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 28, 2011     fengjian           v1.0.0               修改原因
	*/
	public long queryMapRegionTreeCountByParentLocationId(long parentLocationId) throws Exception;
	
	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 保存区域组织结构
	*
	* @param mapRegionTree
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 31, 2011 4:24:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 31, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree) throws Exception;

	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 新增行政区域信息
	*
	* @param mapRegionTree
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 1, 2011 3:57:42 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 1, 2011     fengjian           v1.0.0               修改原因
	*/
	public long createMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree) throws Exception;


	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description:  更新行政区域信息
	*
	* @param mapRegionTree
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 1, 2011 4:40:21 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 1, 2011     fengjian           v1.0.0               修改原因
	*/
	public void updateMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree) throws Exception;

	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 删除行政区域信息
	*
	* @param mapRegionTree
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 1, 2011 4:40:58 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 1, 2011     fengjian           v1.0.0               修改原因
	*/
	public void deleteMapRegionTree(IBOCmMapRegionTreeValue mapRegionTree) throws Exception;

	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 根据地市ID查询城镇信息
	*
	* @param locationId
	* @param locationType
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 10, 2011 5:44:48 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 10, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOTownTypeCountValue[] queryTownTypeCounts(long locationId) throws Exception;

	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 根据地市ID和类型查找信号信息
	*
	* @param locationId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 10, 2011 5:44:52 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 10, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOSignCoverCountValue[] querySignCoverCounts(long locationId, long locationType) throws Exception;
	
	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 查询区域信息
	*
	* @param condition
	* @param parameterMap
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 18, 2011 8:48:27 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 18, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmRegionGroupInfoValue[] queryRegionGroupCustInfo(String condition,Map parameterMap,int start,int end) throws Exception;
	
	
	/**   
	* @Function: ICmGroupNewCountrySideDAO.java
	* @Description: 查询区域信息数量
	*
	* @param condition
	* @param parameterMap
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 19, 2011 12:26:40 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryRegionGroupCustInfoCount(String condition,Map parameterMap) throws Exception;
}
