
package com.asiainfo.crm.cm.custgroup.teaminvoke.in.service.interfaces;

import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdCustValidAmountValue;

public interface ISo2CustGroupSV {

	/**
	 * 根据条件 查询 服务属性的对象数据
	 * @param userId
	 * @param attrId
	 * @param attrValue
	 * @param offerInsId
	 * @param validType
	 * @param regionId
	 * @return
	 * @throws Exception
	 */
	public IInsSrvAttrValue[] getInstSrvAttrByConditions(long userId,long attrId,String attrValue,long offerInsId,String regionId)throws Exception;

	/**
	 * 根据号码（主号/副号）查询有效用户
	 * @param billId
	 * @return
	 * @throws Exception
	 */
	public IInsUserValue getActiveUserByBillId(String billId) throws Exception;
	
	/**
	 * 查询用户的main offer type
	 */
	public String getUserMainOfferType(long userId) throws Exception;
    
	/**
	 * 根据条件查询订购数
	 * @param custId
	 * @param custGroupType
	 * @param offerGroupType
	 * @param offerGroupId
	 * @return
	 * @throws Exception
	 */
    public IBOOrdCustValidAmountValue[] queryOrdCustValidAmounts(long custId, long custGroupType, String offerGroupType, String offerGroupId) throws Exception;
}
