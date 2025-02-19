package com.asiainfo.crm.cm.custview.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.custview.bo.BOCmCfgViewDefineBean;
import com.asiainfo.crm.cm.custview.dao.interfaces.ICmCustViewDAO;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmCfgViewDefineValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperFieldRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperTabRelValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperFieldValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmOperViewDefineValue;
import com.asiainfo.crm.cm.custview.service.interfaces.ICmCustViewSV;
import com.asiainfo.crm.cm.custview.util.CmCfgViewDefineUtil;

public class CmCustViewSVImpl implements ICmCustViewSV {

	// private static transient Log log = LogFactory.getLog(CmCustViewSVImpl.class);

	private ICmCustViewDAO getCustViewDAO() {
		return (ICmCustViewDAO) ServiceFactory.getService(ICmCustViewDAO.class);
	}

	public IBOCmCfgViewDefineValue[] queryOperViewDefine(long operId, long parentViewId, int viewType) throws Exception {
		// 首先查询该操作员是否有自定义TAB页
		StringBuffer condition = new StringBuffer();
		condition.append(IQBOCmOperViewDefineValue.S_ViewState).append(" =:tabState ");
		condition.append(" AND ").append(IQBOCmOperViewDefineValue.S_RelState).append(" =:relState ");
		condition.append(" AND ").append(IQBOCmOperViewDefineValue.S_OperId).append(" =:operId ");
		condition.append(" AND ").append(IQBOCmOperViewDefineValue.S_ParentViewId).append(" =:parentViewId ");
		condition.append(" AND ").append(IQBOCmOperViewDefineValue.S_ViewType).append(" = :viewType ");
		condition.append(" ORDER BY ").append(IQBOCmOperViewDefineValue.S_Sort);

		Map parameter = new HashMap();
		parameter.put("tabState", CmConstants.RecordState.USE);
		parameter.put("relState", CmConstants.RecordState.USE);
		parameter.put("operId", Long.valueOf(operId));
		parameter.put("parentViewId", Long.valueOf(parentViewId));
		parameter.put("viewType", String.valueOf(viewType));

		IQBOCmOperViewDefineValue[] operTabValues = getCustViewDAO().queryOperViewDefines(condition.toString(), parameter);
		if (CmCommonUtil.isNotEmptyObject(operTabValues)) {
			IBOCmCfgViewDefineValue[] values = new BOCmCfgViewDefineBean[operTabValues.length];
			for (int i = 0; i < values.length; i++) {
				values[i] = new BOCmCfgViewDefineBean();
				values[i].copy(operTabValues[i]);
			}
			return values;
		}
		/*
		 * 否则返回默认定义
		 */

		IBOCmCfgViewDefineValue[] viewDefineValues = CmCfgViewDefineUtil.getSubCfgViewDefinesByParentId(parentViewId);
		List results = new ArrayList();
		if (viewDefineValues != null && viewDefineValues.length > 0) {
			for (int i = 0; i < viewDefineValues.length; i++) {
				if (viewDefineValues[i].getViewType() != null && Integer.parseInt(viewDefineValues[i].getViewType()) == viewType) {
					results.add(viewDefineValues[i]);
				}
			}
		}
		return (IBOCmCfgViewDefineValue[]) results.toArray(new IBOCmCfgViewDefineValue[0]);
	}

	public IQBOCmOperFieldValue[] queryOperField(long operId, long bceFrameId, String formId) throws Exception {
		ICmCustViewDAO cmCommonDAO = getCustViewDAO();
		return cmCommonDAO.queryOperField(operId, bceFrameId, formId);
	}

	public IBOCmCfgViewDefineValue[] queryTabDefine(long custType) throws Exception {
		ICmCustViewDAO cmCommonDAO = getCustViewDAO();
		return cmCommonDAO.queryTabDefine(custType);
	}

	public IBOCmCfgViewDefineValue queryCfgViewDefine(long parentViewId, long businessId, int viewLevel, int custType, int channelType) throws Exception {
		return null;
	}

	public void saveTabRel(IBOCmOperTabRelValue[] tabRelValues) throws Exception {
		ICmCustViewDAO cmCommonDAO = getCustViewDAO();
		cmCommonDAO.saveTabRel(tabRelValues);
	}

	public void saveFieldRel(IBOCmOperFieldRelValue[] fieldRelValues) throws Exception {
		ICmCustViewDAO cmCommonDAO = getCustViewDAO();
		cmCommonDAO.saveFieldRel(fieldRelValues);
	}

	public DataContainer[] tabConfigedDs(long custType) throws Exception {
		IBOCmCfgViewDefineValue[] qryValues = queryTabDefine(custType);
		int valueLen = (qryValues == null) ? 0 : qryValues.length;
		DataContainer[] result = new DataContainer[valueLen + 1];

		StringBuffer dsId = new StringBuffer();
		for (int i = 0; i < valueLen; i++) {
			dsId.append(qryValues[i].getViewId()).append(";").append(qryValues[i].getBusinessId()).append(";").append(qryValues[i].getViewType());
			result[i] = new DataContainer();
			result[i].set(IBOCmCfgViewDefineValue.S_ViewType, dsId.toString());
			dsId.delete(0, dsId.length());
		}
		// 增加客户信息区域,客户信息不属于Tab页,但是其下的字段可以自定义显示
		result[valueLen] = new DataContainer();
		result[valueLen].set(IBOCmCfgViewDefineValue.S_ViewTitle, CrmLocaleFactory.getResource("CMS0000074"));
		result[valueLen].set(IBOCmCfgViewDefineValue.S_ViewType, "0;" + 2000000001 + ";");
		return result;
	}

	public DataContainer[] queryOperField(long operId, long tabId, long busiId, String userParam) throws Exception {
		DataContainer[] result = null;

		ICmCustViewDAO cmCommonDAO = getCustViewDAO();
		IQBOCmOperFieldValue[] fieldRelValues = cmCommonDAO.queryOperField(operId, tabId);

		if (fieldRelValues == null || fieldRelValues.length == 0) {
			result = CmServiceFactory.getTeamInvokeSV().queryBceFieldDefine(busiId, userParam);
			// 为每个对象新增tabId字段值
			for (int i = 0, len = result.length; i < len; i++) {
				result[i].set(IBOCmCfgViewDefineValue.S_ViewId, Long.valueOf(tabId));
			}
		} else {
			result = CmCommonUtil.getDataContainers(fieldRelValues, null);
		}

		return result;
	}

	public IBOCmCfgViewDefineValue queryRootCfgViewDefine(long businessId, int custType, int channelType) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmCfgViewDefineValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IBOCmCfgViewDefineValue.S_BusinessId).append(" = :businessId ");
		parameter.put("businessId", businessId);
		condition.append(" AND ").append(IBOCmCfgViewDefineValue.S_CustType).append(" = :custType ");
		parameter.put("custType", custType);
		condition.append(" AND ").append(IBOCmCfgViewDefineValue.S_ChannelType).append(" = :channelType ");
		parameter.put("channelType", channelType);
		condition.append(" AND ").append(IBOCmCfgViewDefineValue.S_ViewLevel).append(" = :viewLevel ");
		parameter.put("viewLevel", 1);
		IBOCmCfgViewDefineValue[] values = getCustViewDAO().queryCfgViewDefines(condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(values)) {
			return values[0];
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.custview.service.interfaces.ICmCustViewSV#qryAllCmCfgViewDefine()
	 */
	public IBOCmCfgViewDefineValue[] qryAllCmCfgViewDefine() throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmCfgViewDefineValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" ORDER BY ").append(IBOCmCfgViewDefineValue.S_ViewSortId);
		IBOCmCfgViewDefineValue[] values = getCustViewDAO().queryCfgViewDefines(condition.toString(), parameter, -1, -1);
		return values;
	}
}
