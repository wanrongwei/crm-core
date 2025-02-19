package com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces;

import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

/**
 *	引入客管的服务 
 */
public interface ICust2CustGroupSV {

	/**
	 *  根据客户ID查询客户信息。
	 *  
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public ICustomerValue getCustomerById(long custId) throws Exception;
	
	/**
	 * 根据custId 查询客户用户信息
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsCmrelValue[] getCmInsCmrel(long custId)throws Exception;

}
