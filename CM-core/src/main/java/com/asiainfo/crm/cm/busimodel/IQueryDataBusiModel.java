/**
 * 
 */
package com.asiainfo.crm.cm.busimodel;

import com.ai.appframe2.bo.DataContainer;
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
public interface IQueryDataBusiModel {

	/**   
	 * 该查询方法主要用于复杂查询条件查询是使用，使用XML或者JSON等格式的字符串来传递查询条件。
	 * 
	 * @Function queryData
	 * @Description 
	 *	使用统一的模式查询数据 。
	 *	
	 *
	 * @param criteria 调用方传入的查询条件，可以是普通的查询条件，可以是JSON字符串，也可以是XML字符串。
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的数据
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-16 下午3:57:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-16     huzq2           v1.0.0               修改原因
	 */
	DataContainerInterface[] queryData(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 根据包含查询条件的DataContainer数据容器数组进行查询数据。
	 * 
	 * @Function queryData
	 * @Description 
	 *
	 * @param criteria 包含查询条件的DataContainer数组
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的数据
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-9 下午2:33:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-9     huzq           v1.0.0               修改原因<br>
	 */
	DataContainerInterface[] queryData(DataContainer[] criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 根据包含查询条件的DataContainer数据容器数组进行查询数据。（该方法支持定制查询指定的列）
	 * 
	 * @Function queryData
	 * @Description 
	 *
	 * @param cols 查询结果集过滤条件。如果需要查询大数据量的结果集，必须要指定查询哪些字段，避免因查询结果集太多导致系统内存溢出！
	 * @param criteria 包含查询条件的DataContainer数组
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的数据
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-19 下午3:08:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-19     huzq           v1.0.0               修改原因<br>
	 */
	DataContainerInterface[] queryData(String[] cols, DataContainer[] criteria, int startNum, int endNum) throws Exception;
}
