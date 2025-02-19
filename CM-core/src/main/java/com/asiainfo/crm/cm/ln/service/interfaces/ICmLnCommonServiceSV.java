package com.asiainfo.crm.cm.ln.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.evaluation.ivalues.IBOCmSpecialListValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue;

public interface ICmLnCommonServiceSV {

	/**   
	 * @Function queryCmInsCmRelValues
	 * @Description 根据客户编号查询客户用户关系信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 11:19:28 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId) throws Exception;
	
	/**   
	 * @Function queryDesUsers
	 * @Description 查询已经销户的用户信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 1, 2012 8:46:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryDesUsers(long custId)throws Exception;
	
	/**   
	 * @Function queryCmInsCmRelValues
	 * @Description 根据客户编号和用户编号查询客户用户关系
	 *
	 * @param custId
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 2, 2012 7:39:41 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 2, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId,long userId) throws Exception;
	
	/**
	 * 
	 * @Function queryCmInsCmRelValues
	 * @Description 根据客户编号和用户编号查询客户用户关系
	 *
	 * @param custId
	 * @param userId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-5 下午2:50:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-5     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId,long userId,int start,int end) throws Exception;
	
	
	/**   
	 * @Function queryCmInsCmRelValuesCount
	 * @Description 根据客户编号和用户编号查询客户用户关系数量
	 *
	 * @param custId
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-5 下午2:57:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-5     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmRelValuesCount(long custId,long userId)throws Exception;

	/**   
	 * @Function saveCmInsCmRelValues
	 * @Description 保存客户用户关系信息
	 *
	 * @param lnCmInsCmRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 12:13:52 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCmInsCmRelValues(IBOLnCmInsCmRelValue[] lnCmInsCmRelValues) throws Exception;
	
	/**   
	 * @Function queryCmInsCmRelValueByUserId
	 * @Description 根据用户编号查询客户用户关系
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 2, 2012 7:39:26 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 2, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValueByUserId(long userId) throws Exception ;
	
	/**
	 * 根据 客户编号查询黑名单
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOCmSpecialListValue[] queryCmSpecialListByCustId(long custId) throws Exception ;
	
	/**   
	 * @Function queryCustDesUsers
	 * @Description 根据客户编号查询号码已经回收的用户信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 1, 2012 8:51:53 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsDesRelValue[] queryCustDesUsers(long custId)throws Exception;
	/**   
	 * @Function queryCmInsCmRelByIds
	 * @Description 根据客户编号查询客户用户关系
	 *
	 * @param custIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 *       huangqun           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByIds(long[] custIds) throws Exception; 
	/**   
	 * @Function queryCmInsCmRelByIds
	 * @Description 根据条件查询客户用户关系
	 *
	 * @param custIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 *       huangqun           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCdns(long custId,long userId,int relType,int userType) throws Exception; 

	/**   
	 * @Function saveDesUsers
	 * @Description 保存销户用户信息
	 *
	 * @param insDesRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveDesUsers(IBOLnCmInsDesRelValue[] insDesRelValues)throws Exception;
	
	/**   
	 * @Function getUserManager
	 * @Description 根据对象查询vip客户经理信息
	 *
	 * @param insDesRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmUserManagerValue[] getUserManager(DataContainer da)throws Exception;
	/**   
	 * @Function delCustomerLevel
	 * @Description 删除集团客户的层级管理 （上级和下级）
	 *
	 * @param grpCustId  集团客户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void delCustomerLevel(long grpCustId,int custLevel)throws Exception;
	/**   
	 * @Function queryCmInsCmRelByCds
	 * @Description 根据条件查询客户用户关系表
	 *
	 * @param custId
	 * @param userId
	 * @param state 0:销户；1：正常；-1：全部
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 8:38:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCds(long custId, long userId, int state) throws Exception;
	/**   
	 * @Function queryCmInsCmRelByCds
	 * @Description 客户用户关系送billing
	 *
	 * @param lnCmInsCmRelValues
	 * @param state 0:销户；1：正常；-1：全部
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun	
	 * @date Oct 5, 2012 8:38:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     huangqun           v1.0.0               修改原因<br>
	 */
	 void sendToBilling(IBOLnCmInsCmRelValue[] lnCmInsCmRelValues)throws Exception;

}
