/**
 * 
 */
package com.asiainfo.crm.cm.busimodel;

import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName IQueryBusiModel
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午3:09:56
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public interface IQueryDataByIdBusiModel {

	/**   
	 * 根据ID（主键）查询信息（该方法仅限于只有一个主键属性的查询，如果主键是复合主键请使用{@link #queryDataById(Map, long)}）
	 * 
	 * @Function queryDataById
	 * @Description 
	 *
	 * @param objectId 主键值【必须】
	 * @param businessId 业务编码:用于记录业务日志，模糊化处理规则判断等【必须】
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午4:27:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	DataContainerInterface queryDataById(long objectId, long businessId) throws Exception;

	/**   
	 * 根据主键属性查询<br>
	 * 
	 * 
	 * @Function queryDataById
	 * @Description 
	 *
	 * @param keyProperties 包含主键属性的Map。【必须】
	 * @param businessId 业务编码：用于记录业务日志，模糊化处理规则判断等【必须】
	 * @return 符合条件的记录
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-18 下午12:44:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-18     huzq           v1.0.0               修改原因<br>
	 */
	DataContainerInterface queryDataById(Map keyProperties, long businessId) throws Exception;
}
