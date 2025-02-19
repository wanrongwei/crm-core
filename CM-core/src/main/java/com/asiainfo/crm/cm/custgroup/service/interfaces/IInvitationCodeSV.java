package com.asiainfo.crm.cm.custgroup.service.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationCodeValue;

public interface IInvitationCodeSV {

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
	 * 根据id查询对象
	 * @param invitationCodeId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationCodeValue getInvitationCodeValueById(long invitationCodeId)throws Exception;
	
	/**
	 * 根据code查询对象
	 * @param invitationCode
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationCodeValue getInvitationCodeValueByCode(String invitationCode)throws Exception;

	/**
	 * 根据条件查询对象
	 * @param invitationCodeId
	 * @param invitationCode
	 * @param manageStatus
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationCodeValue[] getInvitationCodeValuesByConditions(long invitationCodeId, String invitationCode, String manageStatus, int startNum, int endNum)throws Exception ;

	/**
	 * 根据条件随机查询对象
	 * @param invitationCodeId
	 * @param invitationCode
	 * @param manageStatus
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationCodeValue[] getRandomInvitationCodeValuesByConditions(long invitationCodeId, String invitationCode, String manageStatus, int startNum, int endNum)throws Exception ;

	/**
	 * 根据条件查询对象数值
	 * @param invitationCodeId
	 * @param invitationCode
	 * @param manageStatus
	 * @return
	 * @throws Exception
	 */
	public long getInvitationCodeValuesCountByConditions(long invitationCodeId, String invitationCode, String manageStatus)throws Exception ;

	/**
	 * 使用邀请码
	 * @return
	 * @throws Exception
	 */
	public void useInvitationCode(String invitationCode)throws Exception;

	/**
	 * 批量使用邀请码
	 * @return
	 * @throws Exception
	 */
	public void useInvitationCode(String[] invitationCodes)throws Exception;

	/**
	 * 回收邀请码
	 * @param invitationCode
	 * @return
	 * @throws Exception
	 */
	public void recoveryInvitationCode(String invitationCode)throws Exception;
	
	/**
	 * 批量回收邀请码
	 * @param invitationCode
	 * @return
	 * @throws Exception
	 */
	public void recoveryInvitationCode(String[] invitationCodes)throws Exception;
}
