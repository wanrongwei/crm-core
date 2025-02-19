package com.asiainfo.crm.cm.common.util;

import java.util.List;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.asiainfo.crm.cm.common.cache.CmAttachExColCacheImpl;
import com.asiainfo.crm.cm.common.cache.CmAttachExportClassCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExColValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;

public class CmAttachExColUtil {
	/**   
	 * @Function getOneKernelClassCfg
	 * @Description 根据attachid查询缓存导出的文件字段
	 *
	 * @param attachId
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
	public static List getAttachExColOne(String colCode)throws Exception{
		return (List)CacheFactory.get(CmAttachExColCacheImpl.class, CmAttachExColCacheImpl.ONE_ATTACH_COL + colCode);
	}
	/**   
	 * @Function getOneKernelClassCfg
	 * @Description 查询缓所有的存导出的文件字段
	 *
	 * @param attachId
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
	public static IBOCmAttachExColValue[] getAttachExColAll()throws Exception{
		return (IBOCmAttachExColValue[])CacheFactory.get(CmAttachExColCacheImpl.class, CmAttachExColCacheImpl.ALL_ATTACH_COL);
	}
	
	/**   
	 * @Function getAllCmAttachExColClass
	 * @Description 批量导文件类数据  CM_ATTACH_EXPOR_CLASS
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 17, 2012 4:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public static IBOCmAttachExporClassValue[] getAllCmAttachExColClass() throws Exception{
		return (IBOCmAttachExporClassValue[])CacheFactory.get(CmAttachExportClassCacheImpl.class, CmAttachExportClassCacheImpl.ALL_ATTACH_CLASS);
	}
	
	/**   
	 * @Function getCmAttachExportValue
	 * @Description 批量导文件类数据  CM_ATTACH_EXPOR_CLASS
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 17, 2012 4:47:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public static IBOCmAttachExporClassValue getOneCmAttachExColClass(String colCode) throws Exception{
		return (IBOCmAttachExporClassValue)CacheFactory.get(CmAttachExportClassCacheImpl.class, CmAttachExportClassCacheImpl.ONE_ATTACH_CLASS+colCode);
	}
}
