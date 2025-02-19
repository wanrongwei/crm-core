package com.asiainfo.crm.cm.custview.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmCfgViewDefineValue;
import com.asiainfo.crm.cm.custview.service.interfaces.ICmCustViewSV;

public class CmCfgViewDefineCacheImpl extends AbstractCache {

	public static final String ALL_DATA_KEY = "ALL_DATA_";
	public static final String SUB_DATA_KEY = "SUB_DATA_";
	public static final String ROOT_KEY = "ROOT_";

	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		ICmCustViewSV custViewSV = (ICmCustViewSV) ServiceFactory.getService(ICmCustViewSV.class);
		IBOCmCfgViewDefineValue[] cfgViewDefineValues = custViewSV.qryAllCmCfgViewDefine();
		for (int i = 0; i < cfgViewDefineValues.length; i++) {
			/*
			 * 所有数据
			 */
			retMap.put(ALL_DATA_KEY + cfgViewDefineValues[i].getViewId(), cfgViewDefineValues[i]);
			/*
			 * 按照上级视图编号分组
			 */
			if (retMap.containsKey(SUB_DATA_KEY + cfgViewDefineValues[i].getParentViewId())) {
				List list = (List) retMap.get(SUB_DATA_KEY + cfgViewDefineValues[i].getParentViewId());
				list.add(cfgViewDefineValues[i]);
			} else {
				List list = new ArrayList();
				list.add(cfgViewDefineValues[i]);
				retMap.put(SUB_DATA_KEY + cfgViewDefineValues[i].getParentViewId(), list);
			}
			if (cfgViewDefineValues[i].getViewLevel() == 1) {
				retMap.put(ROOT_KEY + cfgViewDefineValues[i].getBusinessId() + "_" + cfgViewDefineValues[i].getCustType() + "_" + cfgViewDefineValues[i].getChannelType(),
						cfgViewDefineValues[i]);
			}
		}
		return retMap;
	}
}
