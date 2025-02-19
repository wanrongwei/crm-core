package com.asiainfo.crm.cm.ln.customer.contact.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactQryValue;
import com.asiainfo.crm.cm.ln.customer.contact.ivalues.IBOLnCmxPartyContactValue;

public interface ICmLnContactSV {

	/**   
	 * @Function saveCmxPartyContacts
	 * @Description 保存参与人联系人扩展表
	 *
	 * @param partyContactValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 2:16:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCmxPartyContacts(IBOLnCmxPartyContactValue[] partyContactValues) throws Exception;

	public void saveData(DataContainer[] values) throws Exception;
	
	/**   
	 * @Function queryPartyContactByContId
	 * @Description 根据联系人编号查询联系人扩展信息
	 *
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 2:31:51 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmxPartyContactValue queryPartyContactByContId(long contId) throws Exception;
	
	/**   
	 * @Function queryPartyContactByContId
	 * @Description 根据集团CUST_ID查询既是联系人又是关键人信息
	 *
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 2:31:51 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContactQryValue[] queryGroupContactByCustId(long custId) throws Exception;

}
