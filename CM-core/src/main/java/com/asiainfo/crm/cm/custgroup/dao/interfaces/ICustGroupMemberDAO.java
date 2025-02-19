package com.asiainfo.crm.cm.custgroup.dao.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupMemberInfoValue;

public interface ICustGroupMemberDAO {

	/**
	 * 单个保存
	 * @param value
	 * @throws Exception
	 */
	public void saveCmGroupMemberInfoValue(IBOCmGroupMemberInfoValue value) throws Exception ;

	/**
	 * 批量保存
	 * @param values
	 * @throws Exception
	 */
	public void saveBatchCmGroupMemberInfoValue(IBOCmGroupMemberInfoValue[] values)throws Exception ;

	/**
	 * 查询表
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
