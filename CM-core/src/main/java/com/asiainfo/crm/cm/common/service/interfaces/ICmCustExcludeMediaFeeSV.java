package com.asiainfo.crm.cm.common.service.interfaces;

import java.rmi.RemoteException;

import com.asiainfo.crm.cm.common.ivalues.IBOCmCustExcludeMediaFeeValue;

public interface ICmCustExcludeMediaFeeSV {
	//批量保存 
	public void saveBatch(IBOCmCustExcludeMediaFeeValue[] values) throws Exception;
	
	//删除CM_CUST_EXLUDE_MEDIA_FEE表中所有数据
	public void deleteAll() throws Exception;
	
	//同步CopyDan的CVR列表到CM_CUST_EXLUDE_MEDIA_FEE表
	public void SyncCopydanClientCVRList()throws Exception;
	
	//根据cvr no查询CM_CUST_EXLUDE_MEDIA_FEE表,有满足条件该接口返回true，否则false
	public String isCustomerExcludeMediaFee(String cvrNumber) throws Exception, RemoteException;
}
