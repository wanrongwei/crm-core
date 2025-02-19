package com.asiainfo.crm.cm.ln.service.interfaces;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;

public interface ICmGrpManagerSV {

	/**   
	 * @Function queryCmInsCmRelValues
	 * @Description 根据客户编号查询集团客户与客户经理关系
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 25, 2012 11:19:28 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupManagerValue[] queryCmGrpManagerValues(long custId) throws Exception;
}
