package com.asiainfo.crm.cm.common.cache;

import java.util.HashMap;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgBusiModelValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;

public class CmBusiModelCacheImpl extends AbstractCache {

	public static final String BUSI_MODEL_PREFIX_KEY = "_";
	
	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		
		IBOCmCfgBusiModelValue[] busiModelValues = commonSV.getAllBusiModels();
		if (busiModelValues != null && busiModelValues.length > 0) {
			String busiModeInterface = null;
			String regionId = null;
			for (int i = 0; i < busiModelValues.length; i++) {
				IBOCmCfgBusiModelValue tmpBusiModelValue = busiModelValues[i];
				
				if(tmpBusiModelValue!=null){
					busiModeInterface = tmpBusiModelValue.getBusiModelInterface();
					regionId = tmpBusiModelValue.getRegionId();
					retMap.put(busiModeInterface+BUSI_MODEL_PREFIX_KEY+regionId, tmpBusiModelValue);
				}
				
			}
		} 
		return retMap;
	}
	
}
