package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxIndivPartyHobbyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxPartyContTypeInfoValue;

public interface ICmxPartyInnerSV {
	
	/**
	 * 
	 * @Function queryIndivPartyHobby
	 * @Description 查询爱好信息
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午08:45:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivPartyHobbyValue[] queryIndivPartyHobby(long partyId,int hobbyType ,int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryindivPartyHobbyCount
	 * @Description 查询爱好数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午08:45:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryindivPartyHobbyCount(long partyId ,int hobbyType) throws Exception;

	/**
	 * 
	 * @Function queryPartyContTypeInfo
	 * @Description 查询集团重要成员联系人类型2信息
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午08:46:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxPartyContTypeInfoValue[] queryPartyContTypeInfo(long partyId,int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryPartyContTypeInfoCount
	 * @Description 查询集团重要成员联系类型2数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午08:47:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryPartyContTypeInfoCount(long partyId) throws Exception;
	
	/**
	 * 
	 * @Function saveIndivPartyHobby
	 * @Description 保存集团重要成员爱好信息
	 *
	 * @param extValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午08:52:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public void saveIndivPartyHobby(IBOCmxIndivPartyHobbyValue[] extValues) throws Exception;
	
	/**
	 * 
	 * @Function savePartyContTypeInfo
	 * @Description 保存集团重要成员联系类型2
	 *
	 * @param extValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午08:53:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public void savePartyContTypeInfo(IBOCmxPartyContTypeInfoValue[] extValues)throws Exception;
	
	/**
	 * 
	 * @Function queryContTypeInfoBycustId
	 * @Description 通过集团custId查询集团联系人类型2信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-5-7 下午5:12:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-7      huaiduo           v1.0.0               修改原因<br>
	 */
	public IBOCmxPartyContTypeInfoValue[] queryContTypeInfoBycustId(long custId)throws Exception;
	
	/**
	 * 
	 * @Function saveIndivPartyHobby
	 * @Description 
	 *
	 * @param extValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-5-25 下午03:32:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-25     mofangrui        v1.0.0               修改原因<br>
	 */
	public void saveIndivPartyHobby(IBOCmxIndivPartyHobbyValue extValues) throws Exception;
	
	/**
	 * 
	 * @Function queryPartyHobbyBypartyId
	 * @Description 
	 *
	 * @param partyId
	 * @param hobbyType
	 * @param bobbyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-6-12 下午03:33:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-12     mofangrui        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivPartyHobbyValue[] queryPartyHobbyBypartyId(long partyId,int hobbyType,int[] bobbyId) throws Exception;

}
