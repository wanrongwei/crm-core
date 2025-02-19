package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;


public interface ICustFSV {

	/**   
	 * @Function queryVpmnCustomerByGroupId
	 * @Description 根据groupId查询虚拟集团
	 *
	 * @param groupId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 11, 2012 10:04:12 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmVpmnCustomerValue queryVpmnCustomerByGroupId(long groupId) throws Exception;
}
