package com.asiainfo.crm.cm.batch.dao.interfaces;

import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataDetailValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDealResultValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFieldConfigValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFuncValue;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmCommonBatchDAO.java
 * @Description: 批处理通用接口
 *
 * @version: v1.0.0
 * @author: zhaiwg
 * @date: Mar 25, 2011 3:07:56 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 25, 2011		zhaiwg          v1.0.0               修改原因
 */
public interface ICmCommonBatchDAO
{
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 查询功能点
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 11, 2011 3:46:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 11, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchFuncValue[] queryBatchFunc() throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 批量处理后更新批量处理成功和失败的信息 
	 *
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 5:12:05 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void updateBatchDataOfNum(long batchDataId, int sucNum, int errNum) throws Exception;

	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 查询功能字段配置
	 *
	 * @param configId
	 * @param $STARTROWINDEX
	 * @param $ENDROWINDEX
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 11, 2011 3:48:03 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 11, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchFieldConfigValue[] queryBatchFieldConfigValueByConfigId(String configId, int $STARTROWINDEX,
			int $ENDROWINDEX) throws Exception;

	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 查询功能字段配置数量
	 *
	 * @param configId
	 * @param $STARTROWINDEX
	 * @param $ENDROWINDEX
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 11, 2011 3:48:08 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 11, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int queryBatchFieldConfigOfCount(String configId ) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据功能id 查询 功能信息
	 *
	 * @param configId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 14, 2011 3:12:24 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 14, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchFuncValue queryBatchFuncById(String configId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 保存批量操作信息 返回批量操作ID
	 *
	 * @param value
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 16, 2011 3:58:16 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 16, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public long saveBatchData(IBOCmBatchDataValue value) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 保存批量操作详细信息
	 *
	 * @param values
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 16, 2011 3:58:21 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 16, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void saveBatchDataDetail(IBOCmBatchDataDetailValue[] values) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据 batchDataId 查询当前批次对应的明细信息
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 24, 2011 9:49:32 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 24, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDataDetailValue[] getBatchDataDetailById(long batchDataId) throws Exception;

	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据 BatchDataId 查询当前批量操作对应的功能点信息
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 24, 2011 9:53:16 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 24, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchFuncValue getBatchFuncByBatchDataId(long batchDataId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据 batchDataId 查询成功处理的结果
	 *
	 * @param batchDataId
	 * @param $startrowindex
	 * @param $endrowindex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:43:19 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDealResultValue[] querySuccessResult(long batchDataId, int $startrowindex,
			int $endrowindex) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据 batchDataId 查询处理失败的结果
	 *
	 * @param batchDataId
	 * @param $startrowindex
	 * @param $endrowindex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:44:04 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDealResultValue[] queryErrorResult(long batchDataId, int $startrowindex,
			int $endrowindex) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据 batchDataId 查询处理成功的数据数目
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:52:26 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int querySuccessResultCountById(long batchDataId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据 batchDataId 查询处理失败的数据数目
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:52:29 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int queryErrorResultCountById(long batchDataId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 保存批量处理结果
	 *
	 * @param aValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 5:40:36 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void saveBatchResults(IBOCmBatchDealResultValue[] aValues) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description:  根据批量Id 查询结果信息
	 *
	 * @param batchId
	 * @param $STARTROWINDEX
	 * @param $ENDROWINDEX
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 27, 2011 11:41:03 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 27, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDealResultValue[] queryBatchResult(String batchId, int $STARTROWINDEX,int $ENDROWINDEX) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据批量Id 查询结果信息数目
	 *
	 * @param batchId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 27, 2011 11:41:07 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 27, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int queryBatchResultCount(String batchId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmCommonBatchDAO.java
	 * @Description: 根据批量Id 查询 批量信息
	 *
	 * @param batchId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 27, 2011 11:41:10 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 27, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDataValue queryBatchDataById(String batchId) throws Exception;

}
