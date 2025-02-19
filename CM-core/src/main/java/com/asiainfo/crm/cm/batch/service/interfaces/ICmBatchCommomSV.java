package com.asiainfo.crm.cm.batch.service.interfaces;

import java.util.List;

import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDealResultValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFuncValue;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmBatchCommomSV.java
 * @Description: 批量通用接口
 *
 * @version: v1.0.0
 * @author: zhaiwg
 * @date: Mar 23, 2011 9:28:06 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 23, 2011		zhaiwg          v1.0.0               修改原因
 */
public interface ICmBatchCommomSV {

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 根据 BatchDataId 查询批量操作详细信息 返回List
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 23, 2011 9:59:30 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 23, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public List getBatchDataDetailToList(long batchDataId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 根据 BatchDataId 查询当前批量操作对应的功能点信息
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 23, 2011 10:00:21 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 23, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchFuncValue getBatchFuncByBatchDataId(long batchDataId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 根据 BatchDataId 查询当前批次的批量业务是否完成
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 23, 2011 10:01:27 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 23, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public boolean isBatchOperComplete(long batchDataId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 根据 batchDataId 查询处理成功的数据
	 *
	 * @param batchDataId
	 * @param startRowIndex
	 * @param endRowIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:47:16 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDealResultValue[] querySuccessResult(long batchDataId, int startRowIndex, int endRowIndex) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 根据 batchDataId 查询处理失败的数据
	 *
	 * @param batchDataId
	 * @param startRowIndex
	 * @param endRowIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:47:50 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDealResultValue[] queryErrorResult(long batchDataId, int startRowIndex, int endRowIndex) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 根据 batchDataId 查询处理成功的数据数目
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:50:51 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int querySuccessResultCountById(long batchDataId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 根据 batchDataId 查询处理失败的数据数目
	 *
	 * @param batchDataId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 2:50:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int queryErrorResultCountById(long batchDataId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description: 保存处理公共 及 失败的 数据
	 *
	 * @param sucList
	 * @param errList
	 * @param batchDataId
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 25, 2011 3:49:38 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 25, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void saveBatchDataResults(List sucList, List errList, long batchDataId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description:  根据批量Id 查询  结果
	 *
	 * @param batchId
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 27, 2011 11:37:43 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 27, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDealResultValue[] queryBatchResult(String batchId, int startIndex, int endIndex) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description:  根据批量ID 查询结果数目
	 *
	 * @param batchId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 27, 2011 11:39:41 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 27, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int queryBatchResultCount(String batchId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchCommomSV.java
	 * @Description:  根据批量Id查询 批量信息
	 *
	 * @param batchId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 27, 2011 11:40:20 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 27, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchDataValue queryBatchDataById(String batchId) throws Exception;

}
