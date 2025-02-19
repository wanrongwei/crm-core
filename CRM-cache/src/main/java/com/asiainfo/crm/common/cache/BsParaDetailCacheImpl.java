package com.asiainfo.crm.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.asiainfo.crm.common.service.interfaces.IBaseSV;

/**
 * <li>系统参数配置表：BS_PARA_DETAIL
 * <li>索引：REGION_ID,PARA_TYPE,PARA_CODE
 * <li>查询条件：STATE='U'
 * 
 * @author linzhaoming
 * 2010-12-27
 *
 */
public class BsParaDetailCacheImpl extends AbstractCache {
	private static transient Log log = LogFactory.getLog(BsParaDetailCacheImpl.class);
	
	/**
	 * 返回Map数据格式：&lt;String, IBOBsParaDetailValue&gt;
	 * <p>Key格式为：regionId_paraCode_paraType
	 */
	public HashMap getData() throws Exception {
		HashMap retMap = new HashMap();
		IBaseSV baseSV = (IBaseSV) ServiceFactory.getService(IBaseSV.class);	
		
		IBOBsParaDetailValue[] bsParaDetailValues = baseSV.getAllBsParaDetail();
		if(bsParaDetailValues != null && bsParaDetailValues.length != 0){
			String strKey = "";
			String specKey = "";
			for(int i=0;i<bsParaDetailValues.length;i++){
				strKey = bsParaDetailValues[i].getRegionId() + "_" + bsParaDetailValues[i].getParaCode() + "_" + bsParaDetailValues[i].getParaType();
				specKey = "Sp_" + bsParaDetailValues[i].getRegionId() + "_" + bsParaDetailValues[i].getParaCode() + "_" + bsParaDetailValues[i].getParaType();
				retMap.put(strKey, bsParaDetailValues[i]);
				if(!retMap.containsKey(specKey)){
					List tmpList = new ArrayList();
					retMap.put(specKey, tmpList);
					tmpList.add(bsParaDetailValues[i]);
				}else{
					List tmpList = (ArrayList) retMap.get(specKey);
					tmpList.add(bsParaDetailValues[i]);
				}
			}
		}else{
			if (log.isInfoEnabled()) {
				log.info(CrmLocaleFactory.getResource("BAS1000021", "BS_PARA_DETAIL"));
			}			
		}		
		return retMap;	
	}
}
