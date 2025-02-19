package com.asiainfo.crm.cm.common.dao.interfaces;

import java.util.HashMap;

import com.asiainfo.crm.cm.common.ivalues.IBOCmCustExcludeMediaFeeValue;

public interface ICmCustExcludeMediaFeeDAO {
	public void saveBatch(IBOCmCustExcludeMediaFeeValue[] values) throws Exception;
	
	public void deleteAll() throws Exception;
	
	public IBOCmCustExcludeMediaFeeValue[] getCmCustExcludeMediaFeeFromWhereSql(String sql, HashMap map) throws Exception;

}
