package com.asiainfo.crm.cm.batch.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataDetailValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFuncValue;

public interface ICmBatchDataSV {

	/**
	 * 
	 * @Function: ICmBatchDataSV.java
	 * @Description: 查询取值说明
	 *
	 * @param dsservice
	 * @param method
	 * @param dsparam
	 * @param dsdisplay
	 * @param dsvalue
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 14, 2011 11:42:43 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 14, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public DataContainer[] queryDescExplain(String notes) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchDataSV.java
	 * @Description: 查询批量功能 DS
	 *
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 11, 2011 3:43:45 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 11, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchFuncValue[] queryBatchFunc() throws Exception;

	/**
	 * 
	 * @Function: ICmBatchDataSV.java
	 * @Description: 查询批量功能的字段配置
	 *
	 * @param configId
	 * @param $STARTROWINDEX
	 * @param $ENDROWINDEX
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 11, 2011 3:43:49 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 11, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public DataContainer[] queryBatchFieldConfigValueByConfigId(String configId, int $STARTROWINDEX, int $ENDROWINDEX) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchDataSV.java
	 * @Description: 查询批量功能字段配置数量
	 *
	 * @param configId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 11, 2011 3:44:12 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 11, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int queryBatchFieldConfigOfCount(String configId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchDataSV.java
	 * @Description: 根据configId 查询 function 信息
	 *
	 * @param configId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 14, 2011 3:01:09 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 14, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmBatchFuncValue queryBatchFuncById(String configId) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchDataSV.java
	 * @Description: 保存批量操作 返回操作Id
	 *
	 * @param value
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 16, 2011 4:13:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 16, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public long saveBatchData(IBOCmBatchDataValue value) throws Exception;

	/**
	 * 
	 * @Function: ICmBatchDataSV.java
	 * @Description: 保存批量操作详细 
	 *
	 * @param values
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Mar 16, 2011 4:14:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 16, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void saveBatchDataDetail(IBOCmBatchDataDetailValue[] values) throws Exception;

}
