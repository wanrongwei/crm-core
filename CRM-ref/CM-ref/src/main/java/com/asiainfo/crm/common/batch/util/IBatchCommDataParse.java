package com.asiainfo.crm.common.batch.util;

import java.util.HashMap;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: IBatchCommDataParse.java
 * @Description: 批量业务公共信息数据解析接口，由业务系统实现
 *
 * @version: v1.0.0
 * @author: liuqq
 * @date: Mar 01, 2011 4:00:29 PM 
 *
 * Modification History:
 * Date           Author          Version     Description
 *---------------------------------------------------------*
 * Mar 01, 2011		liuqq           v1.0.0               修改原因
 */
public interface IBatchCommDataParse {
	

	/**
	 * 执行公共数据的业务解析方法
	 * 
	 * @param batchDataId 批次标识
	 * @param batchTypeCode 业务编码
	 * @param commonXml 公共信息XML串
	 * @return HashMap
	 * @throws Exception
	 */
	public HashMap execute(long batchDataId,String batchTypeCode,String commonXml) throws Exception;

}
