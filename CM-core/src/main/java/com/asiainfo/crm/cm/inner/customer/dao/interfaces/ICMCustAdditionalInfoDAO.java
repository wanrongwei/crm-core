package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoHValue;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoValue;

public interface ICMCustAdditionalInfoDAO {

	/**
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustAdditionalInfoValue[] queryCustAdditionalInfo(long custId) throws Exception;
	
	/**
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public void  saveCustAdditionalInfo(IBOCmCustAdditionalInfoValue[] boCustAdditionalInfo) throws Exception;
	
	/**
	 * 
	 * <p>Title: saveCustAdditionalHisInfo</p>  
	 * <p>Description: </p>  
	 * @param boCustAdditionalHisInfo
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2022年12月1日  
	 * @version V1.0
	 */
	public void saveCustAdditionalHisInfo(IBOCmCustAdditionalInfoHValue[] boCustAdditionalHisInfo) throws Exception;
}
