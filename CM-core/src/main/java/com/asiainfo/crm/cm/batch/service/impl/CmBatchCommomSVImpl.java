package com.asiainfo.crm.cm.batch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.batch.bo.BOCmBatchDealResultBean;
import com.asiainfo.crm.cm.batch.dao.interfaces.ICmCommonBatchDAO;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataDetailValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDataValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchDealResultValue;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFuncValue;
import com.asiainfo.crm.cm.batch.service.interfaces.ICmBatchCommomSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmBatchCommomSVImpl implements ICmBatchCommomSV {

	public List getBatchDataDetailToList(long batchDataId) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		IBOCmBatchDataDetailValue[] aValues = dao.getBatchDataDetailById(batchDataId);
		List detailList = null;
		if (aValues != null && aValues.length != 0) {
			detailList = new ArrayList();
			StringBuffer sb = null;
			for (int i = 0; i < aValues.length; i++) {
				sb = new StringBuffer();
				sb.append(aValues[i].getFileContent());
				if (StringUtils.isNotBlank(aValues[i].getNotes())) {
					sb.append(",").append(aValues[i].getNotes());
				}
				detailList.add(sb.toString());
			}
		}

		return detailList;
	}

	public IBOCmBatchFuncValue getBatchFuncByBatchDataId(long batchDataId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isBatchOperComplete(long batchDataId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public IBOCmBatchDealResultValue[] queryErrorResult(long batchDataId, int $startrowindex, int $endrowindex) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryErrorResult(batchDataId, $startrowindex, $endrowindex);
	}

	public IBOCmBatchDealResultValue[] querySuccessResult(long batchDataId, int $startrowindex, int $endrowindex) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.querySuccessResult(batchDataId, $startrowindex, $endrowindex);
	}

	public int queryErrorResultCountById(long batchDataId) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryErrorResultCountById(batchDataId);
	}

	public int querySuccessResultCountById(long batchDataId) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.querySuccessResultCountById(batchDataId);
	}

	public void saveBatchDataResults(List sucList, List errList, long batchDataId) throws Exception {
		int sucNum = sucList.size();
		int errNum = errList.size();
		String regionId = CmCommonUtil.getDefaultRegionId();

		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		dao.updateBatchDataOfNum(batchDataId, sucNum, errNum);
		IBOCmBatchDealResultValue[] aValues = null;
		if (sucNum + errNum != 0) {
			aValues = new IBOCmBatchDealResultValue[sucNum + errNum];
		}
		if (null != aValues) {
			for (int i = 0; i < sucNum; i++) {
				aValues[i] = new BOCmBatchDealResultBean();
				aValues[i].setBatchDataId(batchDataId);
				aValues[i].setFileContent(sucList.get(i).toString()); // 成功数据需要展示的信息
				aValues[i].setResultType(CmConstants.CommonBatchType.BATCH_RESULT_TYPE_SUCCESS);
				aValues[i].setRegionId(regionId);
			}
		}
		String errText = null; // 错误信息 ： 文本行|错误原因

		if (errNum != 0) {
			for (int j = sucNum; j < (sucNum + errNum); j++) {
				errText = errList.get(j - sucNum).toString(); // 错误数据
				if (null != aValues) {
					aValues[j] = new BOCmBatchDealResultBean();
					if (errText.indexOf("|") == -1) {
						aValues[j].setBatchDataId(batchDataId);
						aValues[j].setFileContent(errText);
						aValues[j].setResultType(CmConstants.CommonBatchType.BATCH_RESULT_TYPE_ERROR);
					} else {
						aValues[j].setBatchDataId(batchDataId);
						aValues[j].setFileContent(errText.split("\\|")[0]);
						aValues[j].setErrorReason(errText.split("\\|")[1]);
						aValues[j].setResultType(CmConstants.CommonBatchType.BATCH_RESULT_TYPE_ERROR);
					}
					aValues[j].setRegionId(regionId);
				}
			}
		}
		dao.saveBatchResults(aValues);
	}

	public IBOCmBatchDataValue queryBatchDataById(String batchId) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryBatchDataById(batchId);
	}

	public IBOCmBatchDealResultValue[] queryBatchResult(String batchId, int $startrowindex, int $endrowindex) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryBatchResult(batchId, $startrowindex, $endrowindex);
	}

	public int queryBatchResultCount(String batchId) throws Exception {
		ICmCommonBatchDAO dao = (ICmCommonBatchDAO) ServiceFactory.getService(ICmCommonBatchDAO.class);
		return dao.queryBatchResultCount(batchId);
	}
}
