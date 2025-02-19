package com.asiainfo.crm.cm.hu.customer.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.hu.party.IBOCmPartyPermissionValue;


public interface ICmPartyHUSV {

	/**   
	 * @Function queryUser
	 * @Description 
	 *
	 * @param partyId
	 * @param partyName
	 * @param addressId
	 * @param contEmail
	 * @param phone
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-30 下午2:18:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-30     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryUser(long partyId,String partyName,long addressId,String contEmail,String phone,int start,int end)throws Exception;
	
	/**   
	 * @Function queryUserCount
	 * @Description 
	 *
	 * @param partyId
	 * @param partyName
	 * @param addressId
	 * @param contEmail
	 * @param phone
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-30 下午2:18:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-30     shitian             v1.0.0               修改原因<br>
	 */
	public int queryUserCount(long partyId, String partyName, long addressId, String contEmail, String phone) throws Exception;
	
	/**   
	 * @Function savePartyPermission
	 * @Description 
	 *
	 * @param partyPermissionValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-30 下午2:18:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-30     shitian             v1.0.0               修改原因<br>
	 */
	public void savePartyPermission(IBOCmPartyPermissionValue[] partyPermissionValues)throws Exception;
	
	/**   
	 * @Function queryPartyPermissionByIdAndRole
	 * @Description 
	 *
	 * @param partyId
	 * @param type	CmConstantsHU.PERMISSION_TYPE
	 * 1.个人(客户，使用者，员工)；2.集团；3.联系人
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-30 下午2:18:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-30     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPartyPermissionValue[] queryPartyPermissionByIdAndRole(long partyId,int type,int start, int end)throws Exception;
	
	/**   
	 * @Function queryPartyPermissionCountByIdAndRole
	 * @Description 
	 *
	 * @param partyId
	 * @param type
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-30 下午2:26:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-30     shitian             v1.0.0               修改原因<br>
	 */
	public int queryPartyPermissionCountByIdAndRole(long partyId,int type)throws Exception;
	
	/**   
	 * @Function queryPartyPermissionById
	 * @Description 
	 *
	 * @param relId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-1-1 下午4:37:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-1-1     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPartyPermissionValue queryPartyPermissionById(long relId)throws Exception;
}
