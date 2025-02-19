/**
 * 
 */
package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-13 下午10:32:25
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
 */
public class CmCfgSpecListTypeCacheImpl extends AbstractCache {

	public final static String ALL_DATA_KEY = "ALL_TYPE";
	public final static String ONE_DATA_KEY = "ONE_TYPE_";

	public final static String SUB_TYPE_DATA_KEY = "SUB_TYPE_";

	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmCfgSpecListTypeValue[] typeValues = CmServiceFactory.getCommonSV().getAllCfgSpecListTypes();
		if (CmCommonUtil.isNotEmptyObject(typeValues)) {
			// 所有
			retMap.put(ALL_DATA_KEY, typeValues);
			for (int i = 0; i < typeValues.length; i++) {
				// 单个
				retMap.put(ONE_DATA_KEY + typeValues[i].getTypeId(), typeValues[i]);
				/*
				 * 按照上级视图编号分组
				 */
				if (retMap.containsKey(SUB_TYPE_DATA_KEY + typeValues[i].getParentTypeId())) {
					List list = (List) retMap.get(SUB_TYPE_DATA_KEY + typeValues[i].getParentTypeId());
					list.add(typeValues[i]);
				} else {
					List list = new ArrayList();
					list.add(typeValues[i]);
					retMap.put(SUB_TYPE_DATA_KEY + typeValues[i].getParentTypeId(), list);
				}
			}
		}
		return retMap;
	}

}
