package com.asiainfo.crm.cm.bi2oneframe.dao.interfaces;

import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmCallMarketingValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmCustLevelValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmSceneMarketingValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserChnnHobbyValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserHobbyValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserSatisfactionValue;
import com.asiainfo.crm.cm.bi2oneframe.ivalues.IBOCmUserValue;


public interface ICmBi2OneframeDAO {

	/**   
	 * @Function queryChnnHobby
	 * @Description 查询用户渠道爱好信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 11:14:26 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmUserChnnHobbyValue[] queryChnnHobby(String billId)throws Exception;
	
	/**   
	 * @Function queryCmUser
	 * @Description 查询用户终端信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 11:14:52 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmUserValue[] queryCmUser(String billId)throws Exception;
	
	/**   
	 * @Function queryCmUserHobby
	 * @Description 查询用户爱好信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 11:15:03 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmUserHobbyValue[] queryCmUserHobby(String billId)throws Exception;
	
	/**   
	 * @Function queryCmCustLevel
	 * @Description 查询用户等级信息
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 11:15:13 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmCustLevelValue[] queryCmCustLevel(String billId)throws Exception;
	
	/**   
	 * @Function queryUserSatisfaction
	 * @Description 查询用户满意度调查
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 11:32:23 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmUserSatisfactionValue[] queryUserSatisfaction(String billId)throws Exception;
	
	/**   
	 * @Function querySceneMarketing
	 * @Description 查询情景营销参考数据
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 11:37:08 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmSceneMarketingValue[] querySceneMarketing(String billId)throws Exception;
	
	/**   
	 * @Function queryCallMarketing
	 * @Description 查询呼入营销参考数据
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 6, 2012 11:37:54 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmCallMarketingValue[] queryCallMarketing(String billId)throws Exception;
	
	/**   
	 * @Function saveCustValueLevel
	 * @Description 保存客户价值级别
	 *
	 * @param custLevelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 11, 2012 2:29:09 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCustValueLevel(IBOCmCustLevelValue[] custLevelValues)throws Exception;
	
	/**   
	 * @Function saveUserChnnalHobby
	 * @Description 保存用户渠道爱好
	 *
	 * @param chnnHobbyValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 11, 2012 2:29:26 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveUserChnnalHobby(IBOCmUserChnnHobbyValue[] chnnHobbyValues)throws Exception;
	
	/**   
	 * @Function saveUser
	 * @Description 保存用户终端信息
	 *
	 * @param userValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 11, 2012 2:29:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveUser(IBOCmUserValue[] userValues)throws Exception;
	
	/**   
	 * @Function saveSceneMarketing
	 * @Description 市场营销
	 *
	 * @param sceneMarketingValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 11, 2012 2:29:44 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveSceneMarketing(IBOCmSceneMarketingValue[] sceneMarketingValues)throws Exception;
	
	/**   
	 * @Function saveCallMarketing
	 * @Description 呼入营销
	 *
	 * @param callMarketingValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 11, 2012 2:29:54 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCallMarketing(IBOCmCallMarketingValue[] callMarketingValues)throws Exception;
	
	/**   
	 * @Function saveUserSatisfaction
	 * @Description 用户满意度
	 *
	 * @param userSatisfactionValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 11, 2012 2:30:10 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveUserSatisfaction(IBOCmUserSatisfactionValue[] userSatisfactionValues)throws Exception;
	
	/**   
	 * @Function saveUserHobby
	 * @Description 用户爱好
	 *
	 * @param userHobbyValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Jun 11, 2012 2:30:20 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveUserHobby(IBOCmUserHobbyValue[] userHobbyValues)throws Exception;
}
