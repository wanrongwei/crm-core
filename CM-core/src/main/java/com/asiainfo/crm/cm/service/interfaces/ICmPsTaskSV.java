package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.common.ivalues.IBOCmPsTaskDealValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;

public interface ICmPsTaskSV {
	public IBOCmPsTaskDealValue[] queryTask(int taskType,long EntityID,String state,String effDate) throws Exception;
	
	
	/**   
	 * @Function queryCprRecord
	 * @Description 
	 *
	 * @param recordId 88888888
	 * @param taskType 6
	 * @throws Exception
	 */
	public IBOCmPsTaskDealValue[] queryCprRecord(long recordId, int taskType) throws Exception;
	
	
	/**   
	 * @Function savePsTaskDeal
	 * @Description 
	 *
	 * @param psTaskDealValue
	 * @throws Exception
	 */
	public void savePsTaskDeal(IBOCmPsTaskDealValue psTaskDealValue) throws Exception;
}
