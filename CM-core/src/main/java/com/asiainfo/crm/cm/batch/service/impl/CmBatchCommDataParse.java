package com.asiainfo.crm.cm.batch.service.impl;

import java.util.HashMap;

import com.asiainfo.crm.cm.batch.util.CmBatchUtil;
import com.asiainfo.crm.common.batch.util.IBatchCommDataParse;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmBatchCommDataParse.java
 * @Description:  批量业务公共信息数据解析
 *
 * @version: v1.0.0
 * @author: zhaiwg
 * @date: Apr 15, 2011 5:38:43 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Apr 15, 2011		zhaiwg          v1.0.0               修改原因
 */
public class CmBatchCommDataParse implements IBatchCommDataParse {

	public HashMap execute(long batchDataId, String batchTypeCode, String commonXml) throws Exception {
		return (HashMap) CmBatchUtil.getCommonInfo(commonXml);
	}
}
