package com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces;

import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedValue;

/**
 *	引入资源的服务 
 */
public interface IRes2CustGroupSV {
	
	/**
	 *	查询已有号码
	 * @param billId
	 * @return
	 * @throws Exception
	 */
	public IBOResPhoneNumUsedValue queryUsedNums(String billId) throws Exception;
}
