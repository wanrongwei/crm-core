package com.asiainfo.crm.cm.common.cache;
/**
 * 缓存导出的文件字段
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExColValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmAttachExColCacheImpl extends AbstractCache {
	/**
	 * 所有属性
	 */
	public static final String ALL_ATTACH_COL = "ALL_ATTACH_COL";
	/**
	 * 根据ATTACH_ID 导出
	 */
	public static final String ONE_ATTACH_COL = "ONE_ATTACH_COL";
	
	
	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmAttachExColValue[] iboCmAttachExColValue = CmServiceFactory.getCmCommonExportSV().getCmAttachExColClass();
		//List list=new ArrayList();
		if (CmCommonUtil.isNotEmptyObject(iboCmAttachExColValue)) {
			retMap.put(ALL_ATTACH_COL, iboCmAttachExColValue);
			for (int i = 0; i < iboCmAttachExColValue.length; i++) {
				/*
				 * 按colCode分组
				 */
				if (retMap.containsKey(ONE_ATTACH_COL+iboCmAttachExColValue[i].getColCode())) {
					List list = (List) retMap.get(ONE_ATTACH_COL + iboCmAttachExColValue[i].getColCode());
					list.add(iboCmAttachExColValue[i]);
				} else {
					List list = new ArrayList();
					list.add(iboCmAttachExColValue[i]);
					retMap.put(ONE_ATTACH_COL + iboCmAttachExColValue[i].getColCode(), list);
				}
			}
		}
		return retMap;
	}
}
