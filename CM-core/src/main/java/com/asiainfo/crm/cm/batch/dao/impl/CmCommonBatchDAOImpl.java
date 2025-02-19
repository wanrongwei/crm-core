package com.asiainfo.crm.cm.batch.dao.impl;

import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.cm.batch.bo.BOCmBatchDataDetailEngine;
import com.asiainfo.crm.cm.batch.bo.BOCmBatchDataEngine;
import com.asiainfo.crm.cm.batch.bo.BOCmBatchDealResultEngine;
import com.asiainfo.crm.cm.batch.bo.BOCmBatchFieldConfigEngine;
import com.asiainfo.crm.cm.batch.bo.BOCmBatchFuncEngine;
import com.asiainfo.crm.cm.batch.dao.interfaces.ICmCommonBatchDAO;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataDetailValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDealResultValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFieldConfigValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFuncValue;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmCommonBatchDAOImpl implements ICmCommonBatchDAO {

	public IBOCmBatchFuncValue[] queryBatchFunc() throws Exception {
		HashMap map = new HashMap();
		StringBuffer sql = new StringBuffer();
		sql.append(IBOCmBatchFuncValue.S_State).append(" = :state ");
		map.put("state", CmConstants.RecordState.USE);
		return BOCmBatchFuncEngine.getBeans(sql.toString(), map);
	}

	public int queryBatchFieldConfigOfCount(String configId) throws Exception {
		HashMap map = new HashMap();
		StringBuffer sql = new StringBuffer();
		sql.append("1 = 1");
		if (StringUtils.isNotBlank(configId)) {
			sql.append(" AND ").append(IBOCmBatchFieldConfigValue.S_ConfigId).append(" = :configId ");
			map.put("configId", Long.valueOf(configId));
		}
		return BOCmBatchFieldConfigEngine.getBeansCount(sql.toString(), map);
	}

	public IBOCmBatchFieldConfigValue[] queryBatchFieldConfigValueByConfigId(String configId, int $startrowindex, int $endrowindex) throws Exception {
		HashMap map = new HashMap();
		StringBuffer sql = new StringBuffer();
		sql.append("1 = 1");

		if (StringUtils.isNotBlank(configId)) {
			sql.append(" AND ").append(IBOCmBatchFieldConfigValue.S_ConfigId).append(" = :configId ");
			map.put("configId", Long.valueOf(configId));
		}
		sql.append(" ORDER BY ").append(IBOCmBatchFieldConfigValue.S_Sort);
		return BOCmBatchFieldConfigEngine.getBeans(null, sql.toString(), map, $startrowindex, $endrowindex, false);
	}

	public IBOCmBatchFuncValue queryBatchFuncById(String configId) throws Exception {
		HashMap map = new HashMap();
		StringBuilder sql = new StringBuilder();
		sql.append(IBOCmBatchFuncValue.S_State).append(" = :state ");
		map.put("state", CmConstants.RecordState.USE);
		if (StringUtils.isNotBlank(configId)) {
			sql.append(" AND ").append(IBOCmBatchFuncValue.S_ConfigId).append(" = :configId ");
			map.put("configId", Long.valueOf(configId));
		}
		IBOCmBatchFuncValue[] batchFuncValues = BOCmBatchFuncEngine.getBeans(sql.toString(), map);
		if (CmCommonUtil.isNotEmptyObject(batchFuncValues)) {
			return batchFuncValues[0];
		}
		return null;
	}

	public long saveBatchData(IBOCmBatchDataValue value) throws Exception {
		long batchDataId = BOCmBatchDataEngine.getNewId().longValue();
		value.setBatchDataId(batchDataId);
		BOCmBatchDataEngine.save(value);
		return batchDataId;
	}

	public void saveBatchDataDetail(IBOCmBatchDataDetailValue[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			values[i].setBatchDataDetailId(BOCmBatchDataDetailEngine.getNewId().longValue());

		}
		BOCmBatchDataDetailEngine.saveBatch(values);
	}

	public IBOCmBatchDataDetailValue[] getBatchDataDetailById(long batchDataId) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmBatchDataDetailValue.S_BatchDataId).append(" =:batchDataId");
		map.put("batchDataId", Long.valueOf(batchDataId));
		return BOCmBatchDataDetailEngine.getBeans(sql.toString(), map);
	}

	public IBOCmBatchFuncValue getBatchFuncByBatchDataId(long batchDataId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public IBOCmBatchDealResultValue[] queryErrorResult(long batchDataId, int $startrowindex, int $endrowindex) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmBatchDealResultValue.S_ResultType).append(" = :resultType");
		map.put("resultType", Integer.valueOf(CmConstants.CommonBatchType.BATCH_RESULT_TYPE_ERROR));
		sql.append(" AND ").append(IBOCmBatchDealResultValue.S_BatchDataId).append(" = :batchDataId");
		map.put("batchDataId", Long.valueOf(batchDataId));
		return BOCmBatchDealResultEngine.getBeans(null, sql.toString(), map, $startrowindex, $endrowindex, false);
	}

	public IBOCmBatchDealResultValue[] querySuccessResult(long batchDataId, int $startrowindex, int $endrowindex) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmBatchDealResultValue.S_ResultType).append(" = :resultType");
		map.put("resultType", Integer.valueOf(CmConstants.CommonBatchType.BATCH_RESULT_TYPE_SUCCESS));
		sql.append(" AND ").append(IBOCmBatchDealResultValue.S_BatchDataId).append(" = :batchDataId");
		map.put("batchDataId", Long.valueOf(batchDataId));
		return BOCmBatchDealResultEngine.getBeans(null, sql.toString(), map, $startrowindex, $endrowindex, false);
	}

	public int queryErrorResultCountById(long batchDataId) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmBatchDealResultValue.S_ResultType).append(" = :resultType");
		map.put("resultType", Integer.valueOf(CmConstants.CommonBatchType.BATCH_RESULT_TYPE_ERROR));
		sql.append(" AND ").append(IBOCmBatchDealResultValue.S_BatchDataId).append(" = :batchDataId");
		map.put("batchDataId", Long.valueOf(batchDataId));
		return BOCmBatchDealResultEngine.getBeansCount(sql.toString(), map);
	}

	public int querySuccessResultCountById(long batchDataId) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmBatchDealResultValue.S_ResultType).append(" = :resultType");
		map.put("resultType", Integer.valueOf(CmConstants.CommonBatchType.BATCH_RESULT_TYPE_SUCCESS));
		sql.append(" AND ").append(IBOCmBatchDealResultValue.S_BatchDataId).append(" = :batchDataId");
		map.put("batchDataId", Long.valueOf(batchDataId));
		return BOCmBatchDealResultEngine.getBeansCount(sql.toString(), map);
	}

	public void updateBatchDataOfNum(long batchDataId, int sucNum, int errNum) throws Exception {
		IBOCmBatchDataValue value = BOCmBatchDataEngine.getBean(batchDataId);
		value.setSuccessCount(sucNum);
		value.setErrorCount(errNum);
		BOCmBatchDataEngine.save(value);
	}

	public void saveBatchResults(IBOCmBatchDealResultValue[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			values[i].setBatchDataDetailId(BOCmBatchDealResultEngine.getNewId().longValue());
			values[i].setDoneDate(BOCmBatchDealResultEngine.getSysDate());
		}
		BOCmBatchDealResultEngine.save(values);
	}

	public IBOCmBatchDataValue queryBatchDataById(String batchId) throws Exception {
		return BOCmBatchDataEngine.getBean(Long.parseLong(batchId));
	}

	public IBOCmBatchDealResultValue[] queryBatchResult(String batchId, int $startrowindex, int $endrowindex) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmBatchDealResultValue.S_BatchDataId).append(" =:batchId");
		map.put("batchId", batchId);
		return BOCmBatchDealResultEngine.getBeans(null, sql.toString(), map, $startrowindex, $endrowindex, false);
	}

	public int queryBatchResultCount(String batchId) throws Exception {
		StringBuffer sql = new StringBuffer();
		HashMap map = new HashMap();
		sql.append(IBOCmBatchDealResultValue.S_BatchDataId).append(" =:batchId");
		map.put("batchId", batchId);
		return BOCmBatchDealResultEngine.getBeansCount(sql.toString(), map);
	}

}