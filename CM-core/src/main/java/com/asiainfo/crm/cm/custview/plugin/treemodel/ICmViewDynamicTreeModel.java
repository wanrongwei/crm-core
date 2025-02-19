/**
 * 
 */
package com.asiainfo.crm.cm.custview.plugin.treemodel;

import java.util.Map;

import com.ai.appframe2.web.tag.dbtree.AIDBTreeNodeInterface;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-29 下午1:31:36
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-29     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmViewDynamicTreeModel {
     
	 /**客户编号**/
	 public static final  String CUST_ID = "CUST_ID";
	 /**客户名称**/
	 public static final String CUST_NAME = "CUST_NAME";
	 /**操作员编号**/
	 public static final String OPER_ID = "OPER_ID";
	 /**客户服务编号*/
	 public static final String CUST_SERVICE_ID = "CUST_SERVICE_ID";
	 /**管理区域标识*/
	 public static final String REGION_ID = "REGION_ID";
	
	 public static final Object QUERY_STRING = "queryString";
	/**   
	 * 获取动态树子节点信息
	 * @Function getDynamicChildren
	 * @Description 
	 *
	 * @param parentNode 父节点信息
	 * @param parameter 其他参数。如：客户编号[CUST_ID]、客户名称[CUST_NAME]、操作员编号[OPER_ID]等。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-29 下午1:32:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     huzq2           v1.0.0               修改原因<br>
	 */
	void getDynamicChildren(AIDBTreeNodeInterface parentNode, Map parameter) throws Exception;

}
