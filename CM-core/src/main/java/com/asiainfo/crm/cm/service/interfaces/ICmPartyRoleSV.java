/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyRoleOkValue;

/**   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author mael
 * @date 2014-9-10 上午10:06:28
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-9-10     mael           v1.0.0               修改原因<br>
 */
public interface ICmPartyRoleSV {

	/**
	 * 
	 * @Function queryPartyRole
	 * @Description 查询角色表
	 *
	 * @param partyId
	 * @param roleType
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-10 上午10:15:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-10     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmPartyRoleValue[] queryPartyRole(long partyId, int roleType, int start, int end) throws Exception;

	/**   
	 * @Function queryPartyRoleCount
	 * @Description 
	 *
	 * @param partyId
	 * @param roleType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-3 下午3:29:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-3     shitian             v1.0.0               修改原因<br>
	 */
	public int queryPartyRoleCount(long partyId, int roleType) throws Exception;

	/**
	 * 
	 * @Function savePartyRole
	 * @Description 保存角色
	 *
	 * @param bean
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-10 上午10:36:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-10     mael           v1.0.0               修改原因<br>
	 */
	public void savePartyRole(BOCmPartyRoleBean bean) throws Exception;

	/**
	 * 
	 * @Function IsPartyRoleUnique
	 * @Description
	 * 注意：角色的状态可能为null,为payer的临时状态
	 *  查询partyId是否只有一个角色，即使角色不存在也返回true
	 *	返回值为true条件:
	 *	partyId的角色只有当前一个角色,且角色的状态为active同时state为U
	 *
	 * @param partyId
	 * @param partyRole
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-11-24上午10:36:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-24     sunqi           v1.0.0               修改原因<br>
	 */
	public boolean IsPartyRoleUnique(long partyId, int partyRole) throws Exception;

	/**
	 * 
	 * @Function queryPartyRoleByPartyId
	 * @Description 查询角色
	 *
	 * @param partyId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-11-24上午10:36:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-24     sunqi           v1.0.0               修改原因<br>
	 */
	public IBOCmPartyRoleValue[] queryPartyRoleByPartyId(long partyId) throws Exception;

	/**
	 * 
	 * @Function savePartyRoleInfo
	 * @Description 保存角色信息,如果有该角色信息则不保存
	 *
	 * @param partyId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-26上午10:36:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-26     huangqun           v1.0.0               修改原因<br>
	 */
	public void savePartyRoleInfo(IBOCmPartyRoleValue value) throws Exception;

	/**   
	 * @Function queryPartyRoles
	 * @Description 
	 *
	 * @param partyId
	 * @param partyType
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-3 下午3:48:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-3     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPartyRoleValue[] queryPartyRoles(long partyId, int partyType, int start, int end) throws Exception;

	public IBOCmPartyRoleValue[] queryPartyRoles(long partyId, int roleType, int roleStatus) throws Exception;
	
	/**   
	 * @Function queryPartyRoleCount
	 * @Description 
	 *
	 * @param partyId
	 * @param roleType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-3 下午3:29:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-3     shitian             v1.0.0               修改原因<br>
	 */
	public int queryPartyRolesCount(long partyId, int partyType) throws Exception;
	
	
	/**   
	 * @Function queryPartyRoles
	 * @Description 
	 *
	 * @param partyId
	 * @param partyType
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-3 下午3:48:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-3     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmPartyRoleOkValue[] qryRoleHistory(int roleType,long partyId,String startDate,String endDate,int STARTROWINDEX, int ENDROWINDEX) throws Exception;
	/**   
	 * @Function queryPartyRoleCount
	 * @Description 
	 *
	 * @param partyId
	 * @param roleType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-3 下午3:29:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-3     shitian             v1.0.0               修改原因<br>
	 */
	public int qryRoleHistoryCount(int roleType,long partyId,String startDate,String endDate) throws Exception;
	
	/**   
	 * @Function queryAllPartyRoles
	 * @Description 查询所有角色，包含state为E的
	 *
	 * @param partyId
	 * @param roleType
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-16 上午11:04:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPartyRoleValue[] queryAllPartyRoles(long partyId, int roleType, int start, int end) throws Exception;

	/**
	 * 针对联系人，处理partyRole 角色
	 * @param partyId
	 * @param operationType  1:新增   2：删除(逻辑删除) 3:修改
	 * @throws Exception 
	 */
	public void dealPartyRoleForContact(long partyId,int operationType,IBOCmPartyRoleValue cmPartyRoleValue) throws Exception;
}
