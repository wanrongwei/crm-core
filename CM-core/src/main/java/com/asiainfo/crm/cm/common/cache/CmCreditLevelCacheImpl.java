package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmCreditLevelCacheImpl extends AbstractCache {

	public final static String ALL_DATA_KEY = "ALL_";
	public final static String ONE_DATA_KEY = "ONE_";

	public final static String REGION_ID_DATA_KEY = "REGION_";
	public final static String CUST_TYPE_DATA_KEY = "CUST_TYPE_";

	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmCreditMappingValue[] creditMappingValues = CmServiceFactory.getCommonSV().getAllCreditMapping();
		if (CmCommonUtil.isNotEmptyObject(creditMappingValues)) {
			// 所有
			retMap.put(ALL_DATA_KEY, creditMappingValues);
			for (int i = 0; i < creditMappingValues.length; i++) {
				// 单个
				retMap.put(ONE_DATA_KEY + creditMappingValues[i].getRegionId() + creditMappingValues[i].getCustType() + creditMappingValues[i].getCreditLevel(),
						creditMappingValues[i]);

				/*
				 * 按照地市分组
				 */
				if (retMap.containsKey(REGION_ID_DATA_KEY + creditMappingValues[i].getRegionId())) {
					List list = (List) retMap.get(REGION_ID_DATA_KEY + creditMappingValues[i].getRegionId());
					list.add(creditMappingValues[i]);
				} else {
					List list = new ArrayList();
					list.add(creditMappingValues[i]);
					retMap.put(REGION_ID_DATA_KEY + creditMappingValues[i].getRegionId(), list);
				}

				/*
				 * 按照客户类型分组
				 */
				if (retMap.containsKey(CUST_TYPE_DATA_KEY + creditMappingValues[i].getCustType())) {
					List list = (List) retMap.get(CUST_TYPE_DATA_KEY + creditMappingValues[i].getCustType());
					list.add(creditMappingValues[i]);
				} else {
					List list = new ArrayList();
					list.add(creditMappingValues[i]);
					retMap.put(CUST_TYPE_DATA_KEY + creditMappingValues[i].getCustType(), list);
				}
			}
		}
		return retMap;
	}

}
