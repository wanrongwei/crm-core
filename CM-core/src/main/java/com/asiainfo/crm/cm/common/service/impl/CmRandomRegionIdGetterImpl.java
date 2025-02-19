package com.asiainfo.crm.cm.common.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.ai.common.util.DistrictUtil;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.ICmDefaultRegionIdGetter;

public class CmRandomRegionIdGetterImpl implements ICmDefaultRegionIdGetter {

	private transient static Log log = LogFactory.getLog(CmRandomRegionIdGetterImpl.class);

	public String getDefaultRegionId() throws Exception {
		// 如果设置了中心，则取当前设置的地市
		if (CenterFactory.isSetCenterInfo()) {
			log.error(CenterFactory.getCenterInfo().getRegion());
			return CenterFactory.getCenterInfo().getRegion();
		}
		long doneCode = CmServiceFactory.getCommonSV().getDoneCode();
		IBOBsDistrictValue[] districtValues = DistrictUtil.getRegion();
		int mod = (int) (doneCode % districtValues.length);
		return districtValues[mod].getRegionId();
	}

}
