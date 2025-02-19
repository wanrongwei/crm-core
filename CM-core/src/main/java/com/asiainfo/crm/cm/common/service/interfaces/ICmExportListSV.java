package com.asiainfo.crm.cm.common.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.bo.BOCmExportListBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.log.ivalues.IBOCmBusiLogValue;

public interface ICmExportListSV 
{
	public void saveData(BOCmExportListBean value) throws Exception;
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum)throws Exception ;
	
	public int queryDataCount(String criteria) throws Exception ;
	
	
	//public void saveLog(BOCmFileSyncErrLogBean value) throws Exception ;
	
	
	
	/**
	 * 查询文件同步日志
	 * @param fileType
	 * @param fileName
	 * @param startDate
	 * @param endDate
	 * @param strIdx
	 * @param endIdx
	 * @return
	 * @throws Exception
	 */
	public IBOCmFileSyncErrLogValue[] queryLog(String fileType,String fileName,String recordId,String startDate,String endDate,int strIdx, int endIdx) throws Exception;
	
	/**
	 * 查询文件同步日志数量
	 * @param fileType
	 * @param fileName
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	
	public int queryLogCount(String fileType,String fileName,String recordId,String startDate,String endDate) throws Exception;
	
	/**
	 * 查询文件同步日志
	 * @param opId
	 * @param busiType
	 * @param startDate
	 * @param endDate
	 * @param strIdx
	 * @param endIdx
	 * @return
	 * @author sunyan
	 * @throws Exception
	 */
	public IBOCmBusiLogValue[] qryLog(String opId,String busiType,String startDate,String endDate,int $STARTROWINDEX, int $ENDROWINDEX) throws Exception;
	/**
	 * 查询文件同步日志数量
	 * @param opId
	 * @param busiType
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	public int qryLogCount(String opId,String busiType,String startDate,String endDate) throws Exception;
	
	
	
	
}
