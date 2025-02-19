package com.asiainfo.crm.cm.hu.account.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;

public interface ICmHUAccountSV {

	/**   
	 * @Function queryPayerAccts
	 * @Description 
	 *
	 * @param custId
	 * @return
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-3-28 上午11:26:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-28     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryPayerAccts(long custId) throws Exception;
}
