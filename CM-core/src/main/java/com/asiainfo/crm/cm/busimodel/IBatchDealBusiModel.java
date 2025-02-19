/**
 * 
 */
package com.asiainfo.crm.cm.busimodel;

import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName IBatchDealBusiModel
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-5-30 上午12:45:15
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-5-30     huzq2           v1.0.0               修改原因<br>
 */
public interface IBatchDealBusiModel {

	/**   
	 * 批量处理业务模型
	 * @Function dealBatch
	 * @Description 
	 *
	 * @param dataContainers
	 * @param otherParam
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-30 上午12:47:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-30     huzq2           v1.0.0               修改原因<br>
	 */
	public ICmDealReturnData dealBatch(DataContainerInterface[] dataContainers, Map otherParam) throws Exception;
}
