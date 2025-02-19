package com.asiainfo.crm.cm.custgroup.dao.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;

public interface ICustGroupDAO {

	/**
	 * 单个保存
	 * @param value
	 * @throws Exception
	 */
	public void saveCmCustomerGroupValue(IBOCmCustomerGroupValue value) throws Exception ;

	/**
	 * 查询表
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(long groupId,int start, int end) throws Exception;
	
	/**
	 * 根据条件 查询  客户群组信息
	 * @param value
	 * @param expireStatus
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(IBOCmCustomerGroupValue value, int groupEffExpStatus, int startNum, int endNum)throws Exception ;
	
	/**
	 * 根据条件 查询  客户群组信息 总数
	 * @param value
	 * @param groupEffExpStatus
	 * @return
	 * @throws Exception
	 */
	public int queryCmCustomerGroupCountByCondition(IBOCmCustomerGroupValue value, int groupEffExpStatus)throws Exception ;

}
