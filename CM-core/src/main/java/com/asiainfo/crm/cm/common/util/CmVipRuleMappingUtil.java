package com.asiainfo.crm.cm.common.util;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.cache.CmVIPScoreRuleCacheImpl;
import com.asiainfo.crm.cm.common.cache.CmVipLevelRuleCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmKernelClassCfgValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmVipScoreRuleValue;


public class CmVipRuleMappingUtil {

	/**   
	 * @Function getOneKernelClassCfg
	 * @Description 单个查询VIP等级规则记录
	 *
	 * @param curClass
	 * @param kernelClass
	 * @param isGlobal
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 17, 2012 5:04:50 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static IBOCmKernelClassCfgValue getOneKernelClassCfg(int curClass,int kernelClass,int isGlobal)throws Exception{
		return (IBOCmKernelClassCfgValue)CacheFactory.get(CmVipLevelRuleCacheImpl.class, CmVipLevelRuleCacheImpl.ONE_DATA_KEY + curClass + kernelClass + isGlobal);
	}
	/**   
	 * @Function getOneKernelClassCfg
	 * @Description查询机场VIP、火车站 特殊服务扣除积分
	 *
	 * @param curClass
	 * @param kernelClass
	 * @param isGlobal
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 17, 2012 5:04:50 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public static IBOCmVipScoreRuleValue getAllTabVipScoreRule(int curClass,int kernelClass,int isGlobal)throws Exception{
		return (IBOCmVipScoreRuleValue)CacheFactory.get(CmVIPScoreRuleCacheImpl.class, CmVIPScoreRuleCacheImpl.ALL_VIP_SCORE);
	}
	
	
	
	
}
