package com.asiainfo.crm.cm.hu.teaminvoke.out.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;

public interface ICm2InterHUSV {

	/**   
	 * @Function saveCustContMediums
	 * @Description 
	 *
	 * @param custContactMediumValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-1-22 下午5:15:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-1-22     shitian             v1.0.0               修改原因<br>
	 */
	public void saveCustContMediums(IBOCmCustContactMediumValue[] custContactMediumValues) throws Exception;
	
	/**
	 *保存party的联系媒介
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-13
	* ICm2InterHUSV
	 */
	public void saveContactContMediums(IBOCmContactContMediumPojoValue[] contactContMediumValues) throws Exception;
	
	/**   
	 * @Function queryPayerAccts
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-3-28 上午11:29:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-28     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryPayerAccts(long custId) throws Exception;
}
