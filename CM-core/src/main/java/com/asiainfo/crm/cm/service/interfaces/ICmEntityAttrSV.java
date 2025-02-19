/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-19 下午1:09:46
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmEntityAttrSV {

	/**   
	 * 保存实体扩展属性信息
	 * @Function saveEntityAttrValues
	 * @Description 
	 *
	 * @param attrValues
	 * @param userObject
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午1:10:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveEntityAttrValues(DataContainerInterface[] attrValues, Map userObject) throws Exception;

	/**   
	 * 根据条件查询实体属性扩展表
	 * @Function getEntityAttrValues
	 * @Description 
	 *
	 * @param claz
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-19 下午5:43:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getEntityAttrValues(Class claz, String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**   
	 * 根据例子（sample）查询扩展属性信息，该方法不需要单独指明最终的class类型，以样例的class为准。
	 * <em>注意：参数sample必须为一个确定的BO*Bean实例！</em>
	 * 
	 * @Function getEntityAttrValues
	 * @Description 
	 *
	 * @param sample 查询样例。其中包含了需要用来查询的查询条件，屏蔽具体的拼接查询条件的业务逻辑
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的扩展属性信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-27 上午11:20:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-27     huzq2           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getEntityAttrValues(DataContainerInterface sample, int startNum, int endNum) throws Exception;
}
