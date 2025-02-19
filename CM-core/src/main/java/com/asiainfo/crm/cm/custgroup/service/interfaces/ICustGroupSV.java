package com.asiainfo.crm.cm.custgroup.service.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;

/**
 * 群组的 行为库
 *	
 */
public interface ICustGroupSV {
	/**
	 * 保存客户群信息
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue saveCustomerGroup(IBOCmCustomerGroupValue value)throws Exception;
	
	/**
	 * 根据条件查询客户群基本信息
	 * @param groupId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(long groupId,int start, int end) throws Exception;


	/**
	 * 根据条件查询客户群基本信息
	 * @param value	群组对象的查询条件
	 * @param groupEffExpStatus 群组的生失效状态
	 * @param startNum	
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(IBOCmCustomerGroupValue value, int groupEffExpStatus,int startNum, int endNum) throws Exception;

	/**
	 * 获取可用的 邀请数量
	 * 
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public int getGroupAvailableMemberCount(long groupId)throws Exception;
	

}
