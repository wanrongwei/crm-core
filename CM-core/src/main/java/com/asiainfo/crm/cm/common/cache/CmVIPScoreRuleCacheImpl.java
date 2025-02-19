package com.asiainfo.crm.cm.common.cache;

import java.util.HashMap;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmVipScoreRuleValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmVIPScoreRuleCacheImpl extends AbstractCache {
	/**
	 * 所有属性
	 */
	public static final String ALL_VIP_SCORE = "ALL_ATTR_VIP_SCORE";
	
	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmVipScoreRuleValue[] kernelClassCfgValues = CmServiceFactory.getCommonSV().getCmVipScoreRuleClass();
		if (CmCommonUtil.isNotEmptyObject(kernelClassCfgValues)) {
			for (int i = 0; i < kernelClassCfgValues.length; i++) {
				retMap.put(ALL_VIP_SCORE, kernelClassCfgValues[i]);
			}
		}
		return retMap;
	}
}
