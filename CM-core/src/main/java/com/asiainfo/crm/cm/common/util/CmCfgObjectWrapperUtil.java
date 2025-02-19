package com.asiainfo.crm.cm.common.util;

import java.util.List;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.cache.CmCfgObjectWrapperCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgObjectWrapperValue;

/**   
 * 
 * 对象显示值转换封装缓存获取工具类型
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-6-11 下午10:51:37
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-6-11     huzq           v1.0.0               修改原因<br>
 */
public class CmCfgObjectWrapperUtil {

	/**   
	 * 根据对象名称获取按照名称分组的对象封装配置信息
	 * @Function getCfgObjectWrappers
	 * @Description 
	 *
	 * @param objectName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-11 下午11:01:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-11     huzq           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgObjectWrapperValue[] getCfgObjectWrappers(String objectName, int type) throws Exception {
		List list = (List) CacheFactory.get(CmCfgObjectWrapperCacheImpl.class, CmCfgObjectWrapperCacheImpl.IDX_BY_OBJ_NAME_TYPE + objectName + type);
		if (CmCommonUtil.isNotEmptyObject(list)) {
			return (IBOCmCfgObjectWrapperValue[]) list.toArray(new IBOCmCfgObjectWrapperValue[0]);
		}
		return new IBOCmCfgObjectWrapperValue[0];
	}

	/**   
	 * @Function getCfgObjectWrapper
	 * @Description 
	 *
	 * @param type
	 * @param objectName
	 * @param attrName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-27 下午4:16:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-27     shitian           v1.0.0               修改原因<br>
	 */
	public static IBOCmCfgObjectWrapperValue getCfgObjectWrapper(int type, String objectName, String attrName) throws Exception {
		return (IBOCmCfgObjectWrapperValue) CacheFactory.get(CmCfgObjectWrapperCacheImpl.class, CmCfgObjectWrapperCacheImpl.ONE_DATA_KEY + type + objectName + attrName);
	}
}
