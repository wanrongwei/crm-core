package com.asiainfo.crm.common.cache;

import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;
import com.asiainfo.crm.common.service.interfaces.IBaseSV;

/**
 * <li>业务编码表：BS_OPERATION
 * <li>索引：BUSINESS_ID
 * <li>查询条件：STATE='U'
 * 
 * @author linzhaoming
 * 2010-12-27
 *
 */
public class BsOperationCacheImpl extends AbstractCache {
	
	private static transient Log log = LogFactory.getLog(BsOperationCacheImpl.class);
	
	/**
	 * 返回Map数据格式：&lt;Long, IBOBsOperationValue&gt;
	 */
	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBaseSV baseSV = (IBaseSV) ServiceFactory.getService(IBaseSV.class);
		
		IBOBsOperationValue[] bsOperationValues = baseSV.getAllBsOperation();
		if (bsOperationValues != null && bsOperationValues.length > 0) {
			Long businessId = null;
			for (int i = 0; i < bsOperationValues.length; i++) {
				businessId = Long.valueOf(bsOperationValues[i].getBusinessId());
				retMap.put(businessId, bsOperationValues[i]);
			}
		} else {
			if (log.isInfoEnabled()) {
				log.info(CrmLocaleFactory.getResource("BAS1000021", "BS_OPERATION"));
			}
		}
		return retMap;
	}
}
