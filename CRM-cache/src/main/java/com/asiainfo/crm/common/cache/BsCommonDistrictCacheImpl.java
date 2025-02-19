package com.asiainfo.crm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.service.interfaces.IBaseSV;

public class BsCommonDistrictCacheImpl extends AbstractCache {

	/**
	 * 按照行政区域编号索引
	 */
	public static final String IDX_BY_ID_KEY = "IDX_BY_ID";
	/**
	 * 按照行政区域编码索引
	 */
	public static final String IDX_BY_CODE_KEY = "IDX_BY_CODE";
	/**
	 * 按照上级行政区域编号索引
	 */
	public static final String IDX_BY_PARENT_ID_KEY = "IDX_BY_P_ID";
	/**
	 * 按照上级行政区域编码索引
	 */
	public static final String IDX_BY_PARENT_CODE_KEY = "IDX_BY_P_CODE";

	/**
	 * 国家行政区域编码索引
	 */
	public static final String IDX_BY_COUNTRY_KEY = "IDX_BY_COUNTRY";

	/**
	 * 省份行政区域编码索引
	 */
	public static final String IDX_BY_PROV_KEY = "IDX_BY_PROV";

	/**
	 * 城市行政区域编码索引
	 */
	public static final String IDX_BY_CITY_KEY = "IDX_BY_CITY";
	/**
	 * 索引分隔符
	 */
	public static final String SPLIT_CODE = "^";

	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBaseSV baseSV = (IBaseSV) ServiceFactory.getService(IBaseSV.class);
		IBOBsCommonDistrictValue[] districtValues = baseSV.queryAllCommonDistricts();
		if (districtValues != null && districtValues.length > 0) {
			// 先将ID索引，后续需要使用
			for (int i = 0; i < districtValues.length; i++) {
				// 按照行政区域编号索引
				retMap.put(IDX_BY_ID_KEY + SPLIT_CODE + districtValues[i].getDistrictId(), districtValues[i]);
				// 按照行政区域编码(+type)索引
				retMap.put(IDX_BY_CODE_KEY + SPLIT_CODE + districtValues[i].getDistrictCode() + SPLIT_CODE + districtValues[i].getDistrictType(), districtValues[i]);
			
				// 按照国家编码进去索引   ADD BY LIYY9
				int districtType = districtValues[i].getDistrictType();
				if(districtType == 1) {
					//国家
					if (retMap.containsKey(IDX_BY_COUNTRY_KEY + SPLIT_CODE + districtValues[i].getDistrictType())) {
						List list = (List) retMap.get(IDX_BY_COUNTRY_KEY + SPLIT_CODE + districtValues[i].getDistrictType());
						list.add(districtValues[i]);
					} else {
						List list = new ArrayList();
						list.add(districtValues[i]);
						retMap.put(IDX_BY_COUNTRY_KEY + SPLIT_CODE + districtValues[i].getDistrictType(), list);
					}
				}
				else if(districtType == 2) {
					//省份
					if (retMap.containsKey(IDX_BY_PROV_KEY + SPLIT_CODE + districtValues[i].getDistrictType())) {
						List list = (List) retMap.get(IDX_BY_PROV_KEY + SPLIT_CODE + districtValues[i].getDistrictType());
						list.add(districtValues[i]);
					} else {
						List list = new ArrayList();
						list.add(districtValues[i]);
						retMap.put(IDX_BY_PROV_KEY + SPLIT_CODE + districtValues[i].getDistrictType(), list);
					}
				}
				else if(districtType == 3) {
					//城市
					if (retMap.containsKey(IDX_BY_CITY_KEY + SPLIT_CODE + districtValues[i].getDistrictType())) {
						List list = (List) retMap.get(IDX_BY_CITY_KEY + SPLIT_CODE + districtValues[i].getDistrictType());
						list.add(districtValues[i]);
					} else {
						List list = new ArrayList();
						list.add(districtValues[i]);
						retMap.put(IDX_BY_CITY_KEY + SPLIT_CODE + districtValues[i].getDistrictType(), list);
					}
				}
				
			}
			for (int i = 0; i < districtValues.length; i++) {
				// 按照上级编号索引
				if (retMap.containsKey(IDX_BY_PARENT_ID_KEY + SPLIT_CODE + districtValues[i].getParentDistrictId())) {
					List list = (List) retMap.get(IDX_BY_PARENT_ID_KEY + SPLIT_CODE + districtValues[i].getParentDistrictId());
					list.add(districtValues[i]);
				} else {
					List list = new ArrayList();
					list.add(districtValues[i]);
					retMap.put(IDX_BY_PARENT_ID_KEY + SPLIT_CODE + districtValues[i].getParentDistrictId(), list);
				}
				// 按照上级编码索引
				IBOBsCommonDistrictValue parentDistrictValue = (IBOBsCommonDistrictValue) retMap.get(IDX_BY_ID_KEY + SPLIT_CODE + districtValues[i].getParentDistrictId());
				// 如果存在父级行政区域，则以父级行政区域编码和父级行政区域类型为Key进行分组索引。
				if (parentDistrictValue != null) {
					if (retMap.containsKey(IDX_BY_PARENT_CODE_KEY + SPLIT_CODE + parentDistrictValue.getDistrictCode() + SPLIT_CODE + parentDistrictValue.getDistrictType())) {
						List list = (List) retMap.get(IDX_BY_PARENT_CODE_KEY + SPLIT_CODE + parentDistrictValue.getDistrictCode() + SPLIT_CODE
								+ parentDistrictValue.getDistrictType());
						list.add(districtValues[i]);
					} else {
						List list = new ArrayList();
						list.add(districtValues[i]);
						retMap.put(IDX_BY_PARENT_CODE_KEY + SPLIT_CODE + parentDistrictValue.getDistrictCode() + SPLIT_CODE + parentDistrictValue.getDistrictType(), list);
					}
				} else {
					// 如果没有获取到父级行政区域,则认为是第一级行政区域,设置districtCode=-1,districtType=-1.
					if (retMap.containsKey(IDX_BY_PARENT_CODE_KEY + SPLIT_CODE + "-1" + SPLIT_CODE + "-1")) {
						List list = (List) retMap.get(IDX_BY_PARENT_CODE_KEY + SPLIT_CODE + "-1" + SPLIT_CODE + "-1");
						list.add(districtValues[i]);
					} else {
						List list = new ArrayList();
						list.add(districtValues[i]);
						retMap.put(IDX_BY_PARENT_CODE_KEY + SPLIT_CODE + "-1" + SPLIT_CODE + "-1", list);
					}
				}
			}
		}
		return retMap;
	}
}
