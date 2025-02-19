package com.asiainfo.crm.cm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;

public class CmCustSegmentCacheImpl extends AbstractCache {

	/*
	 * (non-Javadoc)
	 * @see com.ai.appframe2.complex.cache.impl.AbstractCache#getData()
	 */
	public HashMap getData() throws Exception {
		ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBoCmCustSegmentValue[] vals = sv.queryAllSegments(-1);
		long custSegmentId = 0;
		HashMap map = null;
		if (vals != null && vals.length > 0) {
			map = new HashMap();
			List list = null;
			for (int i = 0; i < vals.length; i++) {
				map.put(vals[i].getSegmentName(), vals[i]);
				list = new ArrayList();
				custSegmentId = vals[i].getSegmentId();
				map.put(custSegmentId, vals[i]);
				getSegmentByParentId(custSegmentId,list);
				map.put("UP_"+custSegmentId, list);
			}
		}
		return map;
	}
    /**
     * 递归获取细分对象列表
     * @Function getSegmentByParentId
     * @Description 
     *
     * @param parentId
     * @param list
     * @throws Exception
     *
     * @version v1.0.0
     * @author yangjh
     * @date 2014-5-5 下午12:40:09
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * 2014-5-5     yangjh           v1.0.0               修改原因<br>
     */
	private void getSegmentByParentId(long parentId, List list) throws Exception {
		ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBoCmCustSegmentValue[] vals = sv.queryAllSegments(parentId);
		for (int i = 0; i < vals.length; i++) {
			list.add(vals[i]);
			getSegmentByParentId(vals[i].getSegmentId(), list);
		}
	}
}
