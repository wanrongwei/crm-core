package com.asiainfo.crm.cm.ln.club.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmUserManagerValue;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmxClubMemberValue;


public interface ICmLnClubMemberSV {

	/**   
	 * @Function saveLnClubMemberExt
	 * @Description 保存俱乐部真实信息
	 *
	 * @param cmxClubMemberValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 18, 2012 3:58:23 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveLnClubMemberExt(IBOLnCmxClubMemberValue[] cmxClubMemberValues)throws Exception;
	
	/**   
	 * @Function queryCmxClubMemberValue
	 * @Description 根据userId查询俱乐部成员真实信息
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 18, 2012 3:57:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmxClubMemberValue queryCmxClubMemberValue(long userId)throws Exception;
	/**
	 * 
	* @Function: ILnCmUserManagerSV.java
	* @Description: 添加/删除/修改
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Sep 19, 2012 2:30:31 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sep 19, 2012     suntao6           v1.0.0              修改原因
	 */
	public void saveData(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ILnCmUserManagerSV.java
* @Description: 根据USERID查找大客户的客户经理
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 19, 2012 2:32:49 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 19, 2012     suntao6           v1.0.0              修改原因
 */
	public IBOLnCmUserManagerValue[] getLnCmUserManager(long userId) throws Exception;
}
