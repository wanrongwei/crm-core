package com.asiainfo.crm.cm.batch.util;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.exolab.castor.xml.Unmarshaller;

import com.ai.appframe2.util.StringUtils;
import com.asiainfo.crm.cm.batch.bo.BOCmBatchDataDetailBean;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataDetailValue;
import com.asiainfo.crm.cm.batch.xsd.commoninfo.Commoninfo;
import com.asiainfo.crm.cm.batch.xsd.commoninfo.XmlMap;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmBatchUtil.java
 * @Description:  批量工具类
 *
 * @version: v1.0.0
 * @author: zhaiwg
 * @date: Apr 29, 2011 2:05:27 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Apr 29, 2011		zhaiwg          v1.0.0               修改原因
 */
public class CmBatchUtil {

	/**
	 * 
	 * @Function: CmBatchUtil.java
	 * @Description:  解析CommonInfo 
	 *
	 * @param commonXml
	 * @return
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 29, 2011 2:07:10 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 29, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public static Map getCommonInfo(String commonXml) throws Exception {

		Commoninfo comminfo = (Commoninfo) Unmarshaller.unmarshal(Commoninfo.class, new StringReader(commonXml));
		XmlMap[] xmlMap = comminfo.getXmlMap();
		HashMap map = new HashMap();
		for (int i = 0; i < xmlMap.length; i++) {
			map.put(xmlMap[i].getKey(), xmlMap[i].getValue());
		}

		return map;
	}

	/**
	 * 
	 * @Function: CmCommonUtil.java
	 * @Description: 将解析上传文件获得的List 转化成 批量明细对象
	 *
	 * @param parseList
	 * @param batchDataId
	 * @param notes
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 10:28:40 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public static IBOCmBatchDataDetailValue[] parseListToValue(List parseList, long batchDataId, String notes) throws Exception {
		IBOCmBatchDataDetailValue[] values = new IBOCmBatchDataDetailValue[parseList.size()];
		String configText = null;
		int index = 0;
		for (java.util.Iterator it = parseList.iterator(); it.hasNext();) {
			List rowList = (List) it.next();
			configText = rowList.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
			values[index] = new BOCmBatchDataDetailBean();
			values[index].setFileContent(configText);
			values[index].setBatchDataId(batchDataId);
			if (!StringUtils.isEmptyString(notes)) {
				values[index].setNotes(notes);
			}
			index++;
		}
		return values;
	}
}
