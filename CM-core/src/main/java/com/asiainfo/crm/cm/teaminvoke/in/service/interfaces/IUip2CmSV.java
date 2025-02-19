package com.asiainfo.crm.cm.teaminvoke.in.service.interfaces;

import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;

public interface IUip2CmSV {
	/**
	 * 	CR372 add
	 * 	在删除CPR资料的同时，调用UAPI接口 撤回CPR 同意书
	 * @param customerValue
	 * @throws Exception
	 */
	public void retractCprPermission(ICustomerValue customerValue) throws Exception;

	/**
	 * 	CR372 add
	 * 	在删除CPR资料的同时，调用UAPI接口 撤回CPR 同意书
	 * @param cmPartyValue
	 * @throws Exception
	 */
	//public void retractCprPermission(IPartyValue cmPartyValue) throws Exception;
	
	/**
	 * 根据type=“POA” 和CustId 查询POA 信息
	 * @param custId
	 * @param poaType
	 * @return
	 * @throws Exception
	 */
	public String queryPoaByPoaTypeAndCustId(String custId,String poaType) throws Exception;
}
