package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOBsOperatorsValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmIndustryConfigValue;
import com.asiainfo.crm.common.service.interfaces.IBaseOperatorsSV;

public class BsOperatorsCacheImpl extends AbstractCache {

	public static final String IDX_BY_GROUP = "IDX_BY_GROUP";
	public static final String IDX_BY_TYPE = "IDX_BY_TYPE";
	public static final String IDX_BY_CODE = "IDX_BY_CODE";
	public static final String IDX_BY_KEY = "IDX_BY_KEY";
	public static final String IDX_BY_ALL = "IDX_BY_ALL";

	public static final String SPLIT_CODE = "^";

	/*
	 * (non-Javadoc)
	 * @see com.ai.appframe2.complex.cache.impl.AbstractCache#getData()
	 */
	public HashMap getData() throws Exception {
		IBaseOperatorsSV sv = (IBaseOperatorsSV) ServiceFactory.getService(IBaseOperatorsSV.class);
		IBOBsOperatorsValue[] bsOperatorsVals = sv.getAllOperators();
		HashMap map = null;
		List operatorGroupList = null;
		List operatorTypeList = null;
		List operatorCodeList = null;
		List allOperatorList = null;
		String operatorGroup = null;// 运营商分组
		String operatorType = null;// 运营商类型
		String operatorCode = null;//  运营商CODE
		if (bsOperatorsVals != null && bsOperatorsVals.length > 0) {
			map = new HashMap();
			allOperatorList = new ArrayList();
			for (int i = 0; i < bsOperatorsVals.length; i++) {
				// 按运营商分组组织缓存数据
				operatorGroup = StringUtils.upperCase(bsOperatorsVals[i].getOperatorsGroup());
				if (map.containsKey(IDX_BY_GROUP + SPLIT_CODE + operatorGroup)) {
					operatorGroupList = (List) map.get(IDX_BY_GROUP + SPLIT_CODE + operatorGroup);
					operatorGroupList.add(bsOperatorsVals[i]);
				} else {
					operatorGroupList = new ArrayList();
					operatorGroupList.add(bsOperatorsVals[i]);
					map.put(IDX_BY_GROUP + SPLIT_CODE + operatorGroup, operatorGroupList);
				}

				// 按运营商类型组织缓存数据
				operatorType =  StringUtils.upperCase(bsOperatorsVals[i].getOperatorsType());
				if (map.containsKey(IDX_BY_TYPE + SPLIT_CODE + operatorType)) {
					operatorTypeList = (List) map.get(IDX_BY_TYPE + SPLIT_CODE + operatorType);
					operatorTypeList.add(bsOperatorsVals[i]);
				} else {
					operatorTypeList = new ArrayList();
					operatorTypeList.add(bsOperatorsVals[i]);
					map.put(IDX_BY_TYPE + SPLIT_CODE + operatorType, operatorTypeList);
				}
				
				// 按运营商CODE组织缓存数据
				operatorCode = StringUtils.upperCase(bsOperatorsVals[i].getOperatorsCode());
				if (map.containsKey(IDX_BY_CODE + SPLIT_CODE + operatorCode)) {
					operatorCodeList = (List) map.get(IDX_BY_CODE + SPLIT_CODE + operatorCode);
					operatorCodeList.add(bsOperatorsVals[i]);
				} else {
					operatorCodeList = new ArrayList();
					operatorCodeList.add(bsOperatorsVals[i]);
					map.put(IDX_BY_CODE + SPLIT_CODE + operatorCode, operatorCodeList);
				}
				// 按运营商编号组织缓存数据
				map.put(IDX_BY_KEY + SPLIT_CODE + bsOperatorsVals[i].getOperatorsId(), bsOperatorsVals[i]);
				allOperatorList.add(bsOperatorsVals[i]);
			}
			
			//存放全量数据
			map.put(IDX_BY_ALL, allOperatorList);

		}
		return map;
	}

	/**
	 * 获取集团行业类型列表
	 * @Function getIndustryByLevel
	 * @Description 
	 *
	 * @param level
	 * @param list
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-9-3 下午12:40:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-3     zhuyy           v1.0.0               修改原因<br>
	 */
	private IBOCmIndustryConfigValue[] getIndustryByParentId(long parentId) throws Exception {
		return CmServiceFactory.getCommonSV().getIndustryByparentId(parentId);
	}
}
