package com.asiainfo.crm.cm.common.util;

import java.util.List;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCfgSpecListTypeBean;
import com.asiainfo.crm.cm.common.cache.CmCfgSpecListTypeCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeValue;

public class CmCfgSpecListTypeUtil {

	/**   
	 * 获取所有的特殊名单类型配置数据
	 * @Function getAllCfgSpecListTypes
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午10:45:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgSpecListTypeValue[] getAllCfgSpecListTypes() throws Exception {
		return (IBOCmCfgSpecListTypeValue[]) CacheFactory.get(CmCfgSpecListTypeCacheImpl.class, CmCfgSpecListTypeCacheImpl.ALL_DATA_KEY);
	}

	/**   
	 * 获取指定ID的特殊名单类型定义信息
	 * @Function getCfgSpecListType
	 * @Description 
	 *
	 * @param typeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午10:47:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgSpecListTypeValue getCfgSpecListType(int typeId) throws Exception {
		return (IBOCmCfgSpecListTypeValue) CacheFactory.get(CmCfgSpecListTypeCacheImpl.class, CmCfgSpecListTypeCacheImpl.ONE_DATA_KEY + typeId);
	}

	/**   
	 * 获取特殊名单子类型
	 * @Function getSubCfgSpecListTypes
	 * @Description 
	 * 
	 * @param parentTypeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午10:48:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgSpecListTypeValue[] getSubCfgSpecListTypes(int parentTypeId) throws Exception {
		if (parentTypeId <= 0) {
			// 对于根节点的类型，上级编号为0
			parentTypeId = 0;
		}
		List list = (List) CacheFactory.get(CmCfgSpecListTypeCacheImpl.class, CmCfgSpecListTypeCacheImpl.SUB_TYPE_DATA_KEY + parentTypeId);
		if (CmCommonUtil.isNotEmptyObject(list)) {
			return (IBOCmCfgSpecListTypeValue[]) list.toArray(new IBOCmCfgSpecListTypeValue[0]);
		}
		return new BOCmCfgSpecListTypeBean[0];
	}
}
