/**
 * 
 */
package com.asiainfo.crm.cm.common.util;

import java.util.List;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.cache.CmCfgTableAttrCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-19 上午11:23:25
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
 */
public class CmCfgTableAttrUtil {

	/**   
	 * 根据表名称和属性编码获取对应的属性定义信息
	 * @Function getCfgTableAttrValue
	 * @Description 
	 *
	 * @param tableName
	 * @param attrCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 上午11:31:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgTableAttrValue getCfgTableAttrValue(String tableName, String attrCode) throws Exception {
		return (IBOCmCfgTableAttrValue) CacheFactory.get(CmCfgTableAttrCacheImpl.class, CmCfgTableAttrCacheImpl.ALL_ATTR_KEY + tableName + "_" + attrCode);
	}

	/**   
	 * 
	 * @Function getCfgTableAttrValues
	 * @Description 
	 *
	 * @param tableName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 上午11:32:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgTableAttrValue[] getCfgTableAttrValues(String tableName) throws Exception {
		List list = (List) CacheFactory.get(CmCfgTableAttrCacheImpl.class, CmCfgTableAttrCacheImpl.TABLE_ATTR_KEY + tableName);
		if (CmCommonUtil.isNotEmptyObject(list)) {
			return (IBOCmCfgTableAttrValue[]) list.toArray(new IBOCmCfgTableAttrValue[0]);
		}
		return new IBOCmCfgTableAttrValue[0];
	}
}
