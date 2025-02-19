package com.asiainfo.crm.cm.common.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExColValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgBusiModelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmKernelClassCfgValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmVipScoreRuleValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmIndustryConfigValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperFieldRelValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ICmCommonDAO
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-13 下午2:13:38
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-13     huzq2           v1.0.0               修改原因
 */
public interface ICmCommonDAO {

	public IBOCmCfgBusiModelValue[] getAllBusiModels() throws Exception;

	/**   
	 * @Function getNewSequence
	 * @Description 通过传入的 bobean 类型对象 获取对应的sequence[不能传入查询BO]
	 *
	 * @param claz
	 * @return 指定Sequence的值
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-13 下午2:15:44<br>
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-13     huzq2           v1.0.0               修改原因
	 */
	public long getNewSequence(Class claz) throws Exception;

	/**   
	 * 获取特殊名单类型配置信息
	 * @Function getCfgSpecListTypes
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午9:59:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgSpecListTypeValue[] getCfgSpecListTypes(String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**   
	 * 根据特殊名单类型查询其互斥的特殊名单类型
	 * @Function getIncompatibleSpecListTypes
	 * @Description 
	 *
	 * @param typeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 下午10:12:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgSpecListTypeValue[] getIncompatibleSpecListTypes(int typeId) throws Exception;

	/**   
	 * 获取所有的扩展属性表属性定义信息
	 * @Function getAllCfgTableAttrs
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 上午11:16:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgTableAttrValue[] getAllCfgTableAttrs() throws Exception;
	
	/**   
	 * @Function getAllCreditMapping
	 * @Description 获取信用等级映射信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 4, 2012 11:21:35 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 4, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmCreditMappingValue[] getAllCreditMapping(String condition, Map parameter, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function getAllKernelClass
	 * @Description 获取所有的VIP等级映射规则
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 17, 2012 4:29:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmKernelClassCfgValue[] getAllKernelClass(String condition, Map parameter, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function getAllIndustry
	 * @Description 获取所有集团行业类型
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-09-03 14:29:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-09-03     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmIndustryConfigValue[] getAllIndustry(String condition, Map parameter, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function getIndustryByparentId
	 * @Description 根据父类型获取集团行业类型
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-09-03 14:29:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-09-03     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmIndustryConfigValue[] getIndustryByparentId(String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**   
	 * @Function getAllKernelClass
	 * @Description VIP积分扣减规则表  CM_VIP_SCORE_RULE
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
	public IBOCmVipScoreRuleValue[] getCmVipScoreRuleClass() throws Exception;
	/**   
	 * @Function getCmAttachExColClass
	 * @Description 批量导出文件字段  CM_ATTACH_EX_COL
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
	public IBOCmAttachExColValue[] getCmAttachExColClass() throws Exception;
	/**   
	 * @Function getCmAttachExportValue
	 * @Description 批量导出文件类字段  CM_ATTACH_EXPOR_CLASS
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
	public IBOCmAttachExporClassValue[] getCmAttachExportValue() throws Exception;
	
	/**   
	 * @Function queryOperField
	 * @Description 查询操作员自定义TAB页
	 *
	 * @param operId
	 * @param tabId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2013 10:40:45 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmOperFieldRelValue[] queryOperField(long operId,long tabId) throws Exception;
}
