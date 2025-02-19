package com.asiainfo.crm.cm.custview.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmCfgViewDefineValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperFieldRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperTabRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperFieldValue;

/**
* @Package: com.asiainfo.crm.customer.common.service.interfaces   
* @Classname: ICmCommonSV.java
* Description: 客户管理公共服务类
* Copyright: Copyright (c) 2010
* Company: AsiaInfo-linkage
* @author: xialing
* @version: v1.0.0
* Create at: Dec 15, 2010 9:24:38 AM 
* 
* Modification History:
* Date               Author            Version            Description
* -------------------------------------------------------------------
* Dec 15, 2010     xialing             v1.0.0               修改原因
 */
public interface ICmCustViewSV {

	/**   
	 * 查询操作员定制的视图信息
	 * @Function queryOperViewDefine
	 * @Description 
	 *
	 * @param operId 操作员编号
	 * @param parentViewId 上级视图编号
	 * @param viewType 视图类型【1：MainView，是作为主框架视图的树形结构、Tab页面等；2：SubView】
	 * @return 符合条件的操作员定制视图信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-27 下午10:46:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-27     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgViewDefineValue[] queryOperViewDefine(long operId, long parentViewId, int viewType) throws Exception;

	/**
	* @Title: queryOperField 
	* @Description: 查询操作员自定义TAB页（字段配置时）
	* @param operId	操作员编号
	* @param tabId	tab页编号
	* @param busiId	bce中businessId
	* @param userParam	bce中自定义参数
	* @return
	* @throws Exception
	 */
	public DataContainer[] queryOperField(long operId, long tabId, long busiId, String userParam) throws Exception;

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
	 * 根据指定条件查询客户管理信息视图定义信息根节点(用于构造客户层次树)
	 * @Function queryRootCfgViewDefine
	 * @Description 
	 *
	 * @param businessId 业务编号
	 * @param custType 客户类型
	 * @param channelType 渠道类型
	 * @return 符合条件的视图定义信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-27 下午12:38:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-27     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmCfgViewDefineValue queryRootCfgViewDefine(long businessId, int custType, int channelType) throws Exception;

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
	* @Title: tabConfigedDs 
	* @Description: Tab的下拉列表服务(服务中增加客户信息区域)
	* @param custType	
	* @return	[tabTitle tabId;busiId;tabType]
	* @throws Exception
	 */
	public DataContainer[] tabConfigedDs(long custType) throws Exception;
	
	
	/**
	 * @Title: qryAllCmCfgViewDefine 
	 * @Description: 查询所有定制的视图信息
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2012-3-29 下午02:50:11
	 */
	public IBOCmCfgViewDefineValue[] qryAllCmCfgViewDefine()throws Exception;
}
