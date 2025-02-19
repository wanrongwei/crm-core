package com.asiainfo.crm.cm.custgroup.dao.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationCodeValue;

public interface IInvitationCodeDAO {

	/**
	 * 保存对象
	 * @param value
	 * @throws Exception
	 */
	public void save(IBOCmInvitationCodeValue value)throws Exception;
	
	/**
	 * 批量保存对象
	 * @param values
	 * @throws Exception
	 */
	public void saveBatch(IBOCmInvitationCodeValue[] values)throws Exception;

	/**
	 * 根据条件获取邀请对象
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationCodeValue[] getInvitationCodeValuesByConditions(IBOCmInvitationCodeValue condition, int startNum, int endNum)throws Exception;
	
	/**
	 * 根据条件 获取邀请cod的条数
	 * @param condition
	 * @return
	 * @throws Exception
	 */
	public long getInvitationCodeValuesCountByConditions(IBOCmInvitationCodeValue condition)throws Exception;

}
