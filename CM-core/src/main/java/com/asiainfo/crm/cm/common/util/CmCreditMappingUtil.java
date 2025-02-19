package com.asiainfo.crm.cm.common.util;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.cache.CmCreditLevelCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;

public class CmCreditMappingUtil {

	/**   
	 * @Function getAllCmCreditMappings
	 * @Description 获取所有的信用映射值
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 4, 2012 11:54:01 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 4, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static IBOCmCreditMappingValue[] getAllCreditMappings() throws Exception {
		return (IBOCmCreditMappingValue[]) CacheFactory.get(CmCreditLevelCacheImpl.class, CmCreditLevelCacheImpl.ALL_DATA_KEY);
	}

	/**   
	 * @Function getCreditMappingsByRegion
	 * @Description 按地市分组
	 *
	 * @param regionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 4, 2012 11:59:02 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 4, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static IBOCmCreditMappingValue[] getCreditMappingsByRegion(String regionId) throws Exception {
		return (IBOCmCreditMappingValue[]) CacheFactory.get(CmCreditLevelCacheImpl.class, CmCreditLevelCacheImpl.REGION_ID_DATA_KEY + regionId);
	}

	/**   
	 * @Function getCreditMappingsByCustType
	 * @Description 按客户类型分组
	 *
	 * @param custType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 4, 2012 11:59:23 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 4, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static IBOCmCreditMappingValue[] getCreditMappingsByCustType(int custType) throws Exception {
		return (IBOCmCreditMappingValue[]) CacheFactory.get(CmCreditLevelCacheImpl.class, CmCreditLevelCacheImpl.CUST_TYPE_DATA_KEY + custType);
	}

	/**   
	 * @Function getOneCreditMapping
	 * @Description 查询单个
	 *
	 * @param regionId
	 * @param custType
	 * @param creditLevel
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 4, 2012 11:59:32 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 4, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static IBOCmCreditMappingValue getOneCreditMapping(String regionId, int custType, int creditLevel) throws Exception {
		return (IBOCmCreditMappingValue) CacheFactory.get(CmCreditLevelCacheImpl.class, CmCreditLevelCacheImpl.ONE_DATA_KEY + regionId + custType + creditLevel);
	}

}
