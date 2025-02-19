package com.asiainfo.crm.cm.common.cache;

import java.util.HashMap;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.bo.BOCmSegMgrGroupRelBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmSegMgrGroupRelValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmSegmentManagerCacheImpl extends AbstractCache {
	
	public static final String SPLIT_CODE = "^";

	/*
	 * (non-Javadoc)
	 * @see com.ai.appframe2.complex.cache.impl.AbstractCache#getData()
	 */
	@SuppressWarnings("unchecked")
	public HashMap getData() throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append("1=1");
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmSegMgrGroupRelBean.class, condition.toString(), null, -1, -1);
		
		HashMap map = null;
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			map = new HashMap();			
			for (int i = 0; i < dcs.length; i++) {
				IBOCmSegMgrGroupRelValue value =(IBOCmSegMgrGroupRelValue) dcs[i];
				//MA   modify by zhuyy @2015-7-21 需求变更 Telenor_REQ_20150717_0045
//				if(CmConstants.segment.MA.equals(DataType.getAsString(value.getSegmentId()))){					
//					map.put(value.getSegmentId() + SPLIT_CODE + value.getZipCode(), value.getGroupCode());
//				} else {					
					map.put(value.getSegmentId(), value.getGroupCode());
//				}
				map.put(value.getGroupCode(), value.getSegmentId());
			}		
		}
		return map;
	}
}
