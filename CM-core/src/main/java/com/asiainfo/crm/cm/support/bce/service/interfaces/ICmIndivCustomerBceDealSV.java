package com.asiainfo.crm.cm.support.bce.service.interfaces;

import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.bce.service.interfaces.IBceDealService;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**
 * BCE处理个人的服务
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Jul 5, 2012 2:18:08 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jul 5, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public interface ICmIndivCustomerBceDealSV extends IBceDealService{

	/**
	 * 修改个人客户信息的业务
	 * @Function dealModifyIndivCustomer
	 * @Description 
	 *
	 * @param custValue
	 * @param bceFrameId
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 5, 2012 2:17:53 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 5, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IBceDealReturnData dealModifyIndivCustomer(IVOCustValue custValue, Long bceFrameId, String businessId) throws Exception;

}
