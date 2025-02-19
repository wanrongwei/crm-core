package com.asiainfo.crm.cm.model.ivalues;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumPojoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmContactContMediumValue;


public interface IVOCustContactValue extends IValueObject {


	/**   
	 * @Function getContactValue
	 * @Description 获得联系人基本信息，包含归属客户ID以及联系人类型等
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 上午11:15:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public IContactValue getContactValue()throws Exception;
	
	/**   
	 * @Function setContactValue
	 * @Description 设置联系人基本信息
	 *
	 * @param contactValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 上午11:15:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public void setContactValue(IContactValue contactValue)throws Exception;
	
	/**   
	 * @Function getContactMediums
	 * @Description 获取联系人的联系媒介
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 上午11:16:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmContactContMediumPojoValue[] getContactMediums()throws Exception;
	
	/**   
	 * @Function setContactMedium
	 * @Description 设置联系人联系媒介
	 *
	 * @param contactContMediumPojoValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 上午11:16:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public void setContactMedium(IBOCmContactContMediumPojoValue[] contactContMediumPojoValues)throws Exception;
	
	/**   
	 * @Function getCustContMediums
	 * @Description 获取客户对应联系人的联系媒介（媒介是从联系人的媒介中选出来）
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 下午2:54:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmContactContMediumValue[] getCustContMediums()throws Exception;
	
	/**   
	 * @Function setCustContMediums
	 * @Description 设置客户联系人媒介信息
	 *
	 * @param custContactContMediumValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-11 下午2:54:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-11     shitian             v1.0.0               修改原因<br>
	 */
	public void setCustContMediums(IBOCmContactContMediumValue[] custContactContMediumValues)throws Exception;

}
