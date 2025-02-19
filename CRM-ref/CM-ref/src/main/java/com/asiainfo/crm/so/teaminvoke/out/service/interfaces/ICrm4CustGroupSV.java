package com.asiainfo.crm.so.teaminvoke.out.service.interfaces;

import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdCustValidAmountValue;

public interface ICrm4CustGroupSV {
    
	/**
	 * 根据条件查询客户订购数
	 * @param custId
	 * @param custGroupType
	 * @param offerGroupType
	 * @param offerGroupId
	 * @return
	 * @throws Exception
	 */
	public IBOOrdCustValidAmountValue[] queryOrdCustValidAmounts(long custId, long custGroupType, String offerGroupType, String offerGroupId)throws Exception;
	
}


