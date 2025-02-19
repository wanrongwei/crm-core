package com.asiainfo.crm.cm.dk.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.dk.bo.BOCmAcctSubStatusBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmAcctSubStatusValue;

public interface ICmAcctSubStatusSV {

	/**
	 * 保存、修改 账户的子状态
	 * @param value
	 * @throws Exception
	 */
	public void saveCmAcctSubStatusValue(BOCmAcctSubStatusBean value)throws Exception;

	/**
	 * 保存、修改 账户的子状态
	 * @param acctId
	 * @param substate
	 * @throws Exception
	 */
	public void saveCmAcctSubStatusValue(long acctId, long substate)throws Exception;

	/**
	 * 根据条件 查询 账户子状态的记录
	 * 
	 * @param custId
	 * @param acctId
	 * @param substate
	 * @param start
	 * @param end
	 * @throws Exception
	 */
	public DataContainerInterface[] queryAcctSubStatusValuesInAll(long custId, long acctId, long substate, int start, int end)throws Exception;

	/**
	 * 根据条件  查询账户子状态的总记录数
	 * 
	 * @param custId
	 * @param acctId
	 * @param substate
	 * @throws Exception
	 */
	public int queryAcctSubStatusValuesCountInAll(long custId, long acctId, long substate)throws Exception;
	
	/**
	 * 根据账户id 查询 cm_acct_sub_state 表记录
	 * @param acctId
	 * @throws Exception
	 */
	public BOCmAcctSubStatusBean getAcctSubStatusValue(long acctId) throws Exception ;

}
