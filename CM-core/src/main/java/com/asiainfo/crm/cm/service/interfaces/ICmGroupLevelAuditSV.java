package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupLevelAuditValue;

public interface ICmGroupLevelAuditSV 
{
	/**
	 * 根据客户编号集团等级申请对象
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupLevelAuditValue[] queryDataByCustId(long custId) throws Exception;
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception;

	public int queryDataCount(String criteria) throws Exception;

	public void saveData(DataContainer[] values) throws Exception;
	
}
