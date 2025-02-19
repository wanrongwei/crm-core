/**
 * 
 */
package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-19 上午11:34:25
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
 */
public class CmCfgTableAttrCacheImpl extends AbstractCache {

	/**
	 * 所有属性
	 */
	public static final String ALL_ATTR_KEY = "ALL_ATTR_";
	/**
	 * 
	 */
	public static final String TABLE_ATTR_KEY = "TABLE_ATTR_";

	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmCfgTableAttrValue[] cfgTableAttrValues = CmServiceFactory.getCommonSV().getAllCfgTableAttrs();
		if (CmCommonUtil.isNotEmptyObject(cfgTableAttrValues)) {
			for (int i = 0; i < cfgTableAttrValues.length; i++) {
				/*
				 * 添加到所有组
				 */
				retMap.put(ALL_ATTR_KEY + cfgTableAttrValues[i].getTableName() + "_" + cfgTableAttrValues[i].getAttrCode(), cfgTableAttrValues[i]);
				/*
				 * 按照表名称分组
				 */
				if (retMap.containsKey(TABLE_ATTR_KEY + cfgTableAttrValues[i].getTableName())) {
					List list = (List) retMap.get(TABLE_ATTR_KEY + cfgTableAttrValues[i].getTableName());
					list.add(cfgTableAttrValues[i]);
				} else {
					List list = new ArrayList();
					list.add(cfgTableAttrValues[i]);
					retMap.put(TABLE_ATTR_KEY + cfgTableAttrValues[i].getTableName(), list);
				}
			}
		}
		return retMap;
	}

}
