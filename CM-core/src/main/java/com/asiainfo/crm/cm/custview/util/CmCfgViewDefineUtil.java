package com.asiainfo.crm.cm.custview.util;

import java.util.List;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.custview.cache.CmCfgViewDefineCacheImpl;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmCfgViewDefineValue;

public class CmCfgViewDefineUtil {

	/**   
	 * 获取根节点
	 * @Function getRootCfgViewDefine
	 * @Description 
	 *
	 * @param businessId
	 * @param custType
	 * @param channelType
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-29 下午7:30:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgViewDefineValue getRootCfgViewDefine(long businessId, int custType, int channelType) throws Exception {
		return (IBOCmCfgViewDefineValue) CacheFactory.get(CmCfgViewDefineCacheImpl.class, CmCfgViewDefineCacheImpl.ROOT_KEY + businessId + "_" + custType + "_"
				+ channelType);
	}

	/**   
	 * 根据父级视图编号获取子视图
	 * @Function getSubCfgViewDefinesByParentId
	 * @Description 
	 *
	 * @param parentViewId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-29 下午7:34:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgViewDefineValue[] getSubCfgViewDefinesByParentId(long parentViewId) throws Exception {
		List list = (List) CacheFactory.get(CmCfgViewDefineCacheImpl.class, CmCfgViewDefineCacheImpl.SUB_DATA_KEY + parentViewId);
		if (CmCommonUtil.isNotEmptyObject(list)) {
			return (IBOCmCfgViewDefineValue[]) list.toArray(new IBOCmCfgViewDefineValue[0]);
		}
		return new IBOCmCfgViewDefineValue[0];
	}

	/**   
	 * 根据视图编号获取视图定义信息
	 * @Function getCfgViewDefineById
	 * @Description 
	 *
	 * @param viewId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-29 下午7:36:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgViewDefineValue getCfgViewDefineById(long viewId) throws Exception {
		return (IBOCmCfgViewDefineValue) CacheFactory.get(CmCfgViewDefineCacheImpl.class, CmCfgViewDefineCacheImpl.ALL_DATA_KEY + viewId);
	}
}
