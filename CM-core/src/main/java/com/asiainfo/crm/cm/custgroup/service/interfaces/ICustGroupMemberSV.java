package com.asiainfo.crm.cm.custgroup.service.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupMemberInfoValue;

/**
 *	群组成员的  行为库
 */
public interface ICustGroupMemberSV {

	/**
	 * 保存客户群成员信息
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupMemberInfoValue saveGroupMemberInfo(IBOCmGroupMemberInfoValue value)throws Exception;
	
	/**
	 * 批量保存客户群成员信息
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupMemberInfoValue[] saveBatchGroupMemberInfo(IBOCmGroupMemberInfoValue[] values)throws Exception;
	
	/**
	 * 根据查询条件客户群成员
	 * @param memberRefId
	 * @param groupId
	 * @param groupRole
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupMemberInfoValue[] queryCmGroupMemberInfoByCondition(long memberRefId, long groupId, long groupRole, int memberStatus, int start, int end) throws Exception;
	
	/**
	 * 根据条件 查询客户成员 数量
	 * @param memberRefId
	 * @param groupId
	 * @param groupRole
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public int queryCmGroupMemberInfoCountByCondition(long memberRefId, long groupId, long groupRole, int memberStatus)throws Exception;
	
}
