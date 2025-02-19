/**
 * 
 */
package com.asiainfo.crm.cm.support.bce.service.interfaces;

import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.bce.service.interfaces.IBceDealService;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-21 下午8:10:55
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmGroupCustomerBceDealSV extends IBceDealService {

	/**   
	 * 处理创建集团客户的业务
	 * @Function dealCreateGroupCustomer
	 * @Description 
	 *
	 * @param bceData
	 * @param bceFrameId
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午8:15:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public IBceDealReturnData dealCreateGroupCustomer(IVOCustValue custValue, Long bceFrameId, String businessId) throws Exception;

	/**   
	 * 修改集团信息
	 * @Function dealModifyGroupCustomer
	 * @Description 
	 *
	 * @param custValue
	 * @param bceFrameId
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午2:25:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-9     huzq           v1.0.0               修改原因<br>
	 */
	public IBceDealReturnData dealModifyGroupCustomer(IVOCustValue custValue, Long bceFrameId, String businessId) throws Exception;

}
