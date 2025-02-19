package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmIndustryConfigValue;

public class CmIndustryCacheImpl extends AbstractCache {
	
	public static final String IDX_BY_LEVEL_PARENT = "IDX_BY_LEVEL_PARENT";
	
	public static final String SPLIT_CODE = "^";

	/*
	 * (non-Javadoc)
	 * @see com.ai.appframe2.complex.cache.impl.AbstractCache#getData()
	 */
	@SuppressWarnings("unchecked")
	public HashMap getData() throws Exception {
		IBOCmIndustryConfigValue[] allIndustrys = CmServiceFactory.getCommonSV().getAllIndustry();		
		HashMap map = null;
		if (allIndustrys != null && allIndustrys.length > 0) {
			map = new HashMap();
			//根据行业父类型存放对应的行业类别
			List lstIndustry;			
			for (int i = 0; i < allIndustrys.length; i++) {
				IBOCmIndustryConfigValue industry = allIndustrys[i];
				if(map.containsKey(IDX_BY_LEVEL_PARENT + SPLIT_CODE + industry.getLevel() + SPLIT_CODE + industry.getParentIndustryId()) ){
					lstIndustry = (List)map.get(IDX_BY_LEVEL_PARENT + SPLIT_CODE + industry.getLevel() + SPLIT_CODE +industry.getParentIndustryId());
					lstIndustry.add(industry);
				} else {
					lstIndustry = new ArrayList();
					lstIndustry.add(industry);
					map.put(IDX_BY_LEVEL_PARENT + SPLIT_CODE + industry.getLevel() + SPLIT_CODE + industry.getParentIndustryId(), lstIndustry);
				}
				map.put(industry.getIndustryId()+ SPLIT_CODE + industry.getLevel(), industry.getParentIndustryId());
				map.put(industry.getIndustryId(), industry.getIndustryName());
			}		
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
