package com.asiainfo.crm.cm.dk.dao.interfaces;

import com.ai.appframe2.common.DataContainerInterface;

public interface ICmAcctSubStatusDAO {


	/**
	 * 根据 条件查询  记录
	 * @param custId
	 * @param acctId
	 * @param substate
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] queryAcctSubStatusValuesInAll(long custId, long acctId, long substate, int start, int end) throws Exception ;
	
	/**
	 * 根据条件查询 记录条数
	 * @param custId
	 * @param acctId
	 * @param substate
	 * @return
	 * @throws Exception
	 */
	public int queryAcctSubStatusValuesCountInAll(long custId, long acctId, long substate) throws Exception ;

}
