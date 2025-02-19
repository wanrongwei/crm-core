package com.asiainfo.crm.cm.busimodel;

import com.ai.appframe2.bo.DataContainer;

public interface IQueryDataBatchBusiModel {

	/**   
	 * 根据主键ID批量查询
	 * @Function queryDataBatch
	 * @Description 
	 *
	 * @param keys
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-26 下午4:53:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-26     huzq2           v1.0.0               修改原因<br>
	 */
	DataContainer[] queryDataBatch(long[] keys, int startNum, int endNum) throws Exception;
}
