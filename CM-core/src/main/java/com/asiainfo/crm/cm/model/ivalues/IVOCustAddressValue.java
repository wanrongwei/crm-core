package com.asiainfo.crm.cm.model.ivalues;

import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;

public interface IVOCustAddressValue extends IValueObject {

	public void setAddressId(long addressId) throws Exception;

	/**   
	 * @Function getAddressId
	 * @Description 获取地址ID
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:11:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public long getAddressId() throws Exception;

	/**   
	 * @Function getAddress
	 * @Description 获取地址对象
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:11:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public address getAddress() throws Exception;

	/**   
	 * @Function getContMedium
	 * @Description 获取联系媒介对象
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:11:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue getContMedium() throws Exception;

	/**   
	 * @Function addAddress
	 * @Description 新增地址
	 *
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:11:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public void addAddress(address address) throws Exception;

	/**   
	 * @Function addContMedium
	 * @Description 新增联系媒介
	 *
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:11:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public void addContMedium(IBOCmCustContactMediumValue contMedium) throws Exception;
}
