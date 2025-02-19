/**
 * 
 */
package com.asiainfo.crm.cm.busimodel;

import com.ai.appframe2.bo.DataContainer;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName IQueryCountBusiModel
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-27 上午9:27:52
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-27     huzq2           v1.0.0               修改原因
 */
public interface IQueryCountBusiModel {

	/**   
	 * @Function queryCount
	 * @Description 根据条件查询记录数量
	 *
	 * @param criteria 查询条件。可以是普通的查询条件，可以是JSON字符串，也可以是XML字符串。
	 * @return 符合条件的记录数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-27 上午9:29:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-27     huzq2           v1.0.0               修改原因
	 */
	int queryCount(String criteria) throws Exception;
	
	/**   
	 * 
	 * @Function queryCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-9 下午2:34:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-9     huzq           v1.0.0               修改原因<br>
	 */
	int queryCount(DataContainer[] criteria) throws Exception;
}
