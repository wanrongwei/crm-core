package com.asiainfo.crm.cm.common.cache;
/**
 * 缓存导出的文件类
 */
import java.util.HashMap;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmAttachExportClassCacheImpl extends AbstractCache {
	/**
	 * 所有属性
	 */
	public static final String ALL_ATTACH_CLASS = "ALL_ATTACH_CLASS";
	/**
	 * 根据ATTACH_ID 导出
	 */
	public static final String ONE_ATTACH_CLASS = "ONE_ATTACH_CLASS";
	
	
	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmAttachExporClassValue[] iboCmAttachExColValue = CmServiceFactory.getCmCommonExportSV().getCmAttachExportValue();
		if (CmCommonUtil.isNotEmptyObject(iboCmAttachExColValue)) {
			retMap.put(ALL_ATTACH_CLASS, iboCmAttachExColValue);
			for (int i = 0; i < iboCmAttachExColValue.length; i++) {
				retMap.put(ONE_ATTACH_CLASS+iboCmAttachExColValue[i].getMethCode(), iboCmAttachExColValue[i]);
			}
		}
		return retMap;
	}
}
