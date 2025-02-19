package com.asiainfo.crm.cm.custview.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.custview.bo.BOCmCfgViewDefineEngine;
import com.asiainfo.crm.cm.custview.bo.BOCmOperFieldRelEngine;
import com.asiainfo.crm.cm.custview.bo.BOCmOperTabRelEngine;
import com.asiainfo.crm.cm.custview.bo.QBOCmOperFieldEngine;
import com.asiainfo.crm.cm.custview.bo.QBOCmOperViewDefineEngine;
import com.asiainfo.crm.cm.custview.dao.interfaces.ICmCustViewDAO;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmCfgViewDefineValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperFieldRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperTabRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperFieldValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperViewDefineValue;

public class CmCustViewDAOImpl implements ICmCustViewDAO {

	public DataContainer[] queryOperTab(long operId, long custType) throws Exception {
		DataContainer[] result = null;

		// 首先查询该操作员是否有自定义TAB页
		StringBuffer sql = new StringBuffer();
		sql.append(IQBOCmOperViewDefineValue.S_ViewState).append(" =:tabState ");
		sql.append(" AND ").append(IQBOCmOperViewDefineValue.S_RelState).append(" =:relState ");
		sql.append(" AND ").append(IQBOCmOperViewDefineValue.S_OperId).append(" =:operId ");
		sql.append(" AND ( ").append(IQBOCmOperViewDefineValue.S_CustType).append(" =:custType ");
		sql.append(" OR ").append(IQBOCmOperFieldValue.S_CustType).append(" = -1 ) ");
		sql.append(" ORDER BY ").append(IQBOCmOperViewDefineValue.S_Sort);

		Map map = new HashMap();
		map.put("tabState", CmConstants.RecordState.USE);
		map.put("relState", CmConstants.RecordState.USE);
		map.put("operId", new Long(operId));
		map.put("custType", new Long(custType));

		IQBOCmOperViewDefineValue[] operTabValues = QBOCmOperViewDefineEngine.getBeans(sql.toString(), map);
		// 没有自定义则取默认配置
		if (operTabValues == null || operTabValues.length == 0) {
			sql.delete(0, sql.length());
			map.clear();

			sql.append(IBOCmCfgViewDefineValue.S_State).append(" =:state ");
			sql.append(" AND ( ").append(IBOCmCfgViewDefineValue.S_CustType).append(" =:custType ");
			sql.append(" OR ").append(IQBOCmOperFieldValue.S_CustType).append(" = -1 ) ");
			sql.append(" ORDER BY ").append(IBOCmCfgViewDefineValue.S_ViewId);

			map.put("state", CmConstants.RecordState.USE);
			map.put("custType", new Long(custType));

			IBOCmCfgViewDefineValue[] tabDefineValues = BOCmCfgViewDefineEngine.getBeans(sql.toString(), map);
			result = CmCommonUtil.getDataContainers(tabDefineValues, null);

		} else {
			result = CmCommonUtil.getDataContainers(operTabValues, null);
		}

		return result;
	}

	public IQBOCmOperFieldValue[] queryOperField(long operId, long bceFrameId, String formId) throws Exception {
		StringBuffer sql = new StringBuffer();
		Map map = new HashMap();

		sql.append(IQBOCmOperFieldValue.S_ViewState).append(" =:tabState ");
		sql.append(" AND ").append(IQBOCmOperFieldValue.S_FieldState).append(" =:fieldState ");
		sql.append(" AND ").append(IQBOCmOperFieldValue.S_OperId).append(" =:operId ");
		sql.append(" AND ").append(IQBOCmOperFieldValue.S_BceFrameId).append(" =:bceFrameId ");
		sql.append(" AND ").append(IQBOCmOperFieldValue.S_BceFormId).append(" =:formId ");
		sql.append(" ORDER BY ").append(IQBOCmOperFieldValue.S_Sort);

		map.put("tabState", CmConstants.RecordState.USE);
		map.put("fieldState", CmConstants.RecordState.USE);
		map.put("operId", new Long(operId));
		map.put("bceFrameId", new Long(bceFrameId));
		map.put("formId", formId);

		return QBOCmOperFieldEngine.getBeans(sql.toString(), map);
	}

	public IBOCmCfgViewDefineValue[] queryTabDefine(long custType) throws Exception {
		StringBuffer sql = new StringBuffer();
		Map map = new HashMap();

		sql.append(IBOCmCfgViewDefineValue.S_State).append(" =:state ");
		sql.append(" AND ( ").append(IBOCmCfgViewDefineValue.S_CustType).append(" =:custType ");
		sql.append(" OR ").append(IQBOCmOperFieldValue.S_CustType).append(" = -1 ) ");

		map.put("state", CmConstants.RecordState.USE);
		map.put("custType", new Long(custType));

		return BOCmCfgViewDefineEngine.getBeans(sql.toString(), map);
	}

	public void saveTabRel(IBOCmOperTabRelValue[] tabRelValues) throws Exception {
		for (int i = 0, length = tabRelValues.length; i < length; i++) {
			if (tabRelValues[i].getViewRelId() == 0) {
				tabRelValues[i].setViewRelId(BOCmOperTabRelEngine.getNewId().longValue());
			}
		}
		BOCmOperTabRelEngine.save(tabRelValues);
	}

	public void saveFieldRel(IBOCmOperFieldRelValue[] fieldRelValues) throws Exception {
		for (int i = 0, length = fieldRelValues.length; i < length; i++) {
			if (fieldRelValues[i].getFieldRelId() == 0) {
				fieldRelValues[i].setFieldRelId(BOCmOperFieldRelEngine.getNewId().longValue());
			}
		}
		BOCmOperFieldRelEngine.save(fieldRelValues);
	}

	public IQBOCmOperFieldValue[] queryOperField(long operId, long tabId) throws Exception {
		StringBuffer sql = new StringBuffer();
		Map map = new HashMap();

		sql.append(IQBOCmOperFieldValue.S_ViewState).append(" =:tabState ");
		sql.append(" AND ").append(IQBOCmOperFieldValue.S_FieldState).append(" =:fieldState ");
		sql.append(" AND ").append(IQBOCmOperFieldValue.S_OperId).append(" =:operId ");
		sql.append(" AND ").append(IQBOCmOperFieldValue.S_ViewId).append(" =:tabId ");
		sql.append(" ORDER BY ").append(IQBOCmOperFieldValue.S_Sort);

		map.put("tabState", CmConstants.RecordState.USE);
		map.put("fieldState", CmConstants.RecordState.USE);
		map.put("operId", new Long(operId));
		map.put("tabId", new Long(tabId));

		return QBOCmOperFieldEngine.getBeans(sql.toString(), map);
	}

	public IBOCmCfgViewDefineValue[] queryCfgViewDefines(String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmCfgViewDefineEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}
	
	public IQBOCmOperViewDefineValue[] queryOperViewDefines(String condition, Map parameter) throws Exception {
		return QBOCmOperViewDefineEngine.getBeans(condition, parameter);
	}
}
