package com.asiainfo.crm.cm.custview.dao.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmCfgViewDefineValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperFieldRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperTabRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperFieldValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperViewDefineValue;

/**
* @Package: com.asiainfo.crm.customer.common.dao.interfaces   
* @Classname: ICmCommonDAO.java
* Description: 客户管理公共服务
* Copyright: Copyright (c) 2011
* Company: AsiaInfo-linkage
* @author: xialing
* @version: v1.0.0
* Create at: Jan 6, 2011 7:26:04 PM 
* 
* Modification History:
* Date               Author            Version            Description
* -------------------------------------------------------------------
* Jan 6, 2011     xialing           v1.0.0               修改原因
 */
public interface ICmCustViewDAO {

	/**
	* @Title: queryOperTab 
	* @Description: 查询操作员自定义TAB页
	* @param operId	操作员编号
	* @param custType	客户类型
	* @return
	* @throws Exception
	 */
	public DataContainer[] queryOperTab(long operId, long custType) throws Exception;

	/**
	* @Title: queryOperField 
	* @Description: 查询操作员自定义TAB页（字段配置时）
	* @param operId	操作员编号
	* @param tabId	tab页编号
	* @return
	* @throws Exception
	 */
	public IQBOCmOperFieldValue[] queryOperField(long operId, long tabId) throws Exception;

	/**
	* @Title: queryOperField 
	* @Description: 查询操作员自定义显示字段（字段过滤时）
	* @param operId	操作员编号
	* @param bceFrameId	bce中bceFrameId
	* @param formId	bce中bceFormId
	* @return
	* @throws Exception
	 */
	public IQBOCmOperFieldValue[] queryOperField(long operId, long bceFrameId, String formId) throws Exception;

	/**
	* @Title: queryTabDefine 
	* @Description: 查询某个客户类型下定义的全部TAB区域
	* @param custType	客户类型
	* @return
	* @throws Exception
	 */
	public IBOCmCfgViewDefineValue[] queryTabDefine(long custType) throws Exception;

	/**
	* @Title: saveTabRel 
	* @Description: 保存自定义的显示Tab信息
	* @param tabRelValues
	* @throws Exception
	 */
	public void saveTabRel(IBOCmOperTabRelValue[] tabRelValues) throws Exception;

	/**
	* @Title: saveFieldRel 
	* @Description: 保存自定义的显示字段信息
	* @param fieldRelValues
	* @throws Exception
	*/
	public void saveFieldRel(IBOCmOperFieldRelValue[] fieldRelValues) throws Exception;

	/**   
	 * @Function queryCfgViewDefines
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-27 下午1:01:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-27     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgViewDefineValue[] queryCfgViewDefines(String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**   
	 * 查询操作员定制的视图信息
	 * @Function queryOperViewDefines
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-27 下午11:03:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-27     huzq2           v1.0.0               修改原因<br>
	 */
	public IQBOCmOperViewDefineValue[] queryOperViewDefines(String condition, Map parameter) throws Exception;
}
