package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgObjectWrapperValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmCfgObjectWrapperCacheImpl extends AbstractCache {

	public final static String ALL_DATA_KEY = "ALL_OBJ_WRAPPER";
	public final static String ONE_DATA_KEY = "IDX_OBJ_NAME_";
	public final static String IDX_BY_OBJ_NAME = "IDX_OBJ_NAME_";
	public final static String IDX_BY_OBJ_NAME_TYPE = "IDX_OBJ_NAME_TYPE_";

	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBOCmCfgObjectWrapperValue[] objectWrapperValues = CmServiceFactory.getCommonSV().getAllCfgObjectWrappers();
		if (CmCommonUtil.isNotEmptyObject(objectWrapperValues)) {
			retMap.put(ALL_DATA_KEY, objectWrapperValues);
			for (int i = 0; i < objectWrapperValues.length; i++) {
				IBOCmCfgObjectWrapperValue wrapperValue = objectWrapperValues[i];
				retMap.put(ONE_DATA_KEY + wrapperValue.getObjType() + wrapperValue.getObjectName() + wrapperValue.getAttrName(), wrapperValue);
				/*
				 * 按照对象名称and type分组
				 */
				if (retMap.containsKey(IDX_BY_OBJ_NAME_TYPE + wrapperValue.getObjectName() + wrapperValue.getObjType())) {
					List list = (List) retMap.get(IDX_BY_OBJ_NAME_TYPE + wrapperValue.getObjectName() + wrapperValue.getObjType());
					list.add(wrapperValue);
				} else {
					List list = new ArrayList();
					list.add(wrapperValue);
					retMap.put(IDX_BY_OBJ_NAME_TYPE + wrapperValue.getObjectName() + wrapperValue.getObjType(), list);
				}
			}
		}
		return retMap;
	}

}
