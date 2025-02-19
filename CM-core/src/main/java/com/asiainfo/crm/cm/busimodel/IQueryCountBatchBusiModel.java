package com.asiainfo.crm.cm.busimodel;


public interface IQueryCountBatchBusiModel {
	/**   
	 * 批量查询数量
	 * @Function queryCountBatch
	 * @Description 
	 *
	 * @param keys
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-26 下午4:54:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-26     huzq2           v1.0.0               修改原因<br>
	 */
	int queryCountBatch(long[] keys) throws Exception;
}
