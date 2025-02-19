package com.asiainfo.crm.cm.inner.party.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxIndivPartyHobbyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxPartyContTypeInfoValue;

public interface ICmxPartyDAO {
	
	/**
	 * 
	 * @Function queryIndivPartyHobby
	 * @Description 
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午09:17:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxIndivPartyHobbyValue[] queryIndivPartyHobby(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryIndivPartyHobbyCount
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午09:17:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	int queryIndivPartyHobbyCount(String condition, Map parameter) throws Exception;
	/**
	 * 
	 * @Function queryPartyContTypeInfo
	 * @Description 
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午09:17:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxPartyContTypeInfoValue[] queryPartyContTypeInfo(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**
	 * 
	 * @Function queryPartyContTypeInfoCount
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午09:18:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	int queryPartyContTypeInfoCount(String condition, Map parameter) throws Exception;
	
	/**
	 * 
	 * @Function saveIndivPartyHobby
	 * @Description 
	 *
	 * @param cmxIndivPartyHobbyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午09:20:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public void saveIndivPartyHobby(IBOCmxIndivPartyHobbyValue[] cmxIndivPartyHobbyValue) throws Exception;
	
	/**
	 * 
	 * @Function savePartyContTypeInfo
	 * @Description 
	 *
	 * @param cmxPartyContTypeInfoValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-3-30 下午09:21:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     huaiduo        v1.0.0               修改原因<br>
	 */
	public void savePartyContTypeInfo(IBOCmxPartyContTypeInfoValue[] cmxPartyContTypeInfoValue)throws Exception;
	
	/**
	 * 
	 * @Function savePartyHobby
	 * @Description 保存感动会员爱好信息
	 *
	 * @param cmxIndivPartyHobbyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-5-25 下午03:35:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-25     mofangrui        v1.0.0               修改原因<br>
	 */
	public void savePartyHobby(IBOCmxIndivPartyHobbyValue cmxIndivPartyHobbyValue) throws Exception ;
}
