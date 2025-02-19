package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContMedTypeValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

/**
 * @Copyright Copyright (c) 2012 Asiainfo
 * 
 * @ClassName
 * @Description 该类的功能描述
 * 
 * @version v1.0.0
 * @author huangqun
 * @date 2014-7-14 上午11:34:25 <br>
 *       Modification History:<br>
 *       Date Author Version Description<br>
 *       ---------------------------------------------------------*<br>
 *       2014-7-14 huangqun v1.0.0 修改原因<br>
 */
public class CmCustContMedTypeCacheImpl extends AbstractCache {

	public HashMap getData() throws Exception {
		HashMap map = null;
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContMedTypeValue[] values = service.queryCmCustContMedType(CmConstants.RecordState.USE);
		if (null != values && values.length > 0) {
			map = new HashMap();
			for (int i = 0; i < values.length; i++) {
				if (map.containsKey(String.valueOf(values[i].getUpContMedTypeId()) + "_" + String.valueOf(values[i].getUseType()))) {
					List list = (List) map.get(String.valueOf(values[i].getUpContMedTypeId()) + "_" + String.valueOf(values[i].getUseType()));
					list.add(values[i]);
				} else {
					List list = new ArrayList();
					list.add(values[i]);
					map.put(String.valueOf(values[i].getUpContMedTypeId()) + "_" + String.valueOf(values[i].getUseType()), list);
				}
			}
		}
		return map;
	}

}