package com.asiainfo.crm.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOBsOperatorsBean;
import com.asiainfo.crm.cm.common.cache.BsOperatorsCacheImpl;
import com.asiainfo.crm.cm.common.ivalues.IBOBsOperatorsValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.common.dao.interfaces.IBaseOperatorsDAO;
import com.asiainfo.crm.common.service.interfaces.IBaseOperatorsSV;

public class BaseOperatorsSVImpl implements IBaseOperatorsSV {

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.common.interfaces.IBaseOperatorsSV#getAllOperators()
	 */
	public IBOBsOperatorsValue[] getAllOperators() throws Exception {
		IBaseOperatorsDAO dao = (IBaseOperatorsDAO) ServiceFactory.getService(IBaseOperatorsDAO.class);
		IBOBsOperatorsValue[] vals = dao.getAllOperators();
		return vals;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.common.service.interfaces.IBaseOperatorsSV#queryOperatorsByCond(long, java.lang.String,
	 * java.lang.String)
	 */
	public IBOBsOperatorsValue[] queryOperatorsByCond(long operatorsId, String operatorCode, String operatorName) throws Exception {
		IBOBsOperatorsValue[] vals = null;
		if (operatorsId > 0) {
			IBOBsOperatorsValue val = (IBOBsOperatorsValue) CacheFactory.get(BsOperatorsCacheImpl.class, BsOperatorsCacheImpl.IDX_BY_KEY + BsOperatorsCacheImpl.SPLIT_CODE
					+ operatorsId);
			vals = new IBOBsOperatorsValue[] { val };
		} else {
			// 只根据名称查询
			if (StringUtils.isNotBlank(operatorName) && StringUtils.isBlank(operatorCode)) {
				IBOBsOperatorsValue val = null;
				operatorName = StringUtils.upperCase(operatorName);
				List<IBOBsOperatorsValue> list = (List<IBOBsOperatorsValue>) CacheFactory.get(BsOperatorsCacheImpl.class, BsOperatorsCacheImpl.IDX_BY_ALL);
				List<IBOBsOperatorsValue> destList = null;
				if (!list.isEmpty()) {
					destList = new ArrayList<IBOBsOperatorsValue>();
					for (int i = 0; i < list.size(); i++) {
						val = list.get(i);
						if (StringUtils.contains(StringUtils.upperCase(val.getOperatorsName()), operatorName)) {
							destList.add(val);
						}
					}
					if (!destList.isEmpty()) {
						return (IBOBsOperatorsValue[]) destList.toArray(new IBOBsOperatorsValue[0]);
					}
				}
				// 只根据CODE查询
			} else if (StringUtils.isNotBlank(operatorCode) && StringUtils.isBlank(operatorName)) {
				operatorCode = StringUtils.upperCase(operatorCode);
				List<IBOBsOperatorsValue> list = (List<IBOBsOperatorsValue>) CacheFactory.get(BsOperatorsCacheImpl.class, BsOperatorsCacheImpl.IDX_BY_CODE
						+ BsOperatorsCacheImpl.SPLIT_CODE + operatorCode);
				if (!list.isEmpty()) {
					return (IBOBsOperatorsValue[]) list.toArray(new IBOBsOperatorsValue[0]);
				}
				// 根据CODE和名称查询
			} else if (StringUtils.isNotBlank(operatorCode) && StringUtils.isNotBlank(operatorName)) {
				operatorName = StringUtils.upperCase(operatorName);
				operatorCode = StringUtils.upperCase(operatorCode);
				List<IBOBsOperatorsValue> list = (List<IBOBsOperatorsValue>) CacheFactory.get(BsOperatorsCacheImpl.class, BsOperatorsCacheImpl.IDX_BY_CODE
						+ BsOperatorsCacheImpl.SPLIT_CODE + operatorCode);
				IBOBsOperatorsValue val = null;
				List<IBOBsOperatorsValue> destList = null;
				if (!list.isEmpty()) {
					destList = new ArrayList<IBOBsOperatorsValue>();
					for (int i = 0; i < list.size(); i++) {
						val = list.get(i);
						if (StringUtils.contains(StringUtils.upperCase(val.getOperatorsName()), operatorName)) {
							destList.add(val);
						}
					}
					if (destList != null && !destList.isEmpty()) {
						return (IBOBsOperatorsValue[]) destList.toArray(new IBOBsOperatorsValue[0]);
					}
				}
				// 查询所有
			} else {
				List<IBOBsOperatorsValue> list = (List<IBOBsOperatorsValue>) CacheFactory.get(BsOperatorsCacheImpl.class, BsOperatorsCacheImpl.IDX_BY_ALL);
				if (!list.isEmpty()) {
					return (IBOBsOperatorsValue[]) list.toArray(new IBOBsOperatorsValue[0]);
				}
			}
		}
		if (CmCommonUtil.isEmptyObj(vals)) {
			vals = new IBOBsOperatorsValue[0];
		}
		return vals;
	}

	public void SyncBsOperatorsFromBilling(String plmnId, Map OperatorsInfo) throws Exception {
		IBaseOperatorsDAO sv = (IBaseOperatorsDAO) ServiceFactory.getService(IBaseOperatorsDAO.class);
		StringBuilder condition = new StringBuilder("");
		condition.append(IBOBsOperatorsValue.S_OperatorsCode).append(" = :plmnId ");
		condition.append(" AND ").append(IBOBsOperatorsValue.S_State).append(" = 'U' ");
		Map parameter = new HashMap();
		parameter.put("plmnId", plmnId);
		IBOBsOperatorsValue[] vals = sv.getAllOperatorsByCdn(condition.toString(), parameter);
		if (vals != null && vals.length > 0) {// 修改信息
			String operatorsCode = "";
			String operatorsType = "";
			String operatorsName = "";
			String note = "";
			if (OperatorsInfo != null) {
				if (OperatorsInfo.get("CUSTOMER_TYPE") != null) {
					operatorsType = String.valueOf(OperatorsInfo.get("CUSTOMER_TYPE"));
				}
				if (OperatorsInfo.get("NAME") != null) {
					operatorsName = String.valueOf(OperatorsInfo.get("NAME"));
				}
				if (OperatorsInfo.get("PLMN_ID") != null) {
					operatorsCode = String.valueOf(OperatorsInfo.get("PLMN_ID"));
				}
				if (OperatorsInfo.get("REMARK") != null) {
					note = String.valueOf(OperatorsInfo.get("REMARK"));
				}
			}
			for (int i = 0; i < vals.length; i++) {
				vals[i].setOperatorsCode(operatorsCode);
				vals[i].setOperatorsType(operatorsType);
				vals[i].setOperatorsName(operatorsName);
				vals[i].setNote(note);
			}
			sv.saveOperators(vals);
		} else {// 新增信息
			IBOBsOperatorsValue val = new BOBsOperatorsBean();
			ICmCommonSV cmCommonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
			val.setOperatorsId(cmCommonSV.getCommonNewSequence("CMX_CLUB_MEMBER"));
			val.setOperatorsCode(plmnId);
			String operatorsType = "";
			String operatorsName = "";
			String note = "";
			if (OperatorsInfo != null) {
				if (OperatorsInfo.get("CUSTOMER_TYPE") != null) {
					operatorsType = String.valueOf(OperatorsInfo.get("CUSTOMER_TYPE"));
				}
				if (OperatorsInfo.get("NAME") != null) {
					operatorsName = String.valueOf(OperatorsInfo.get("NAME"));
				}
				if (OperatorsInfo.get("REMARK") != null) {
					note = String.valueOf(OperatorsInfo.get("REMARK"));
				}
			}
			val.setOperatorsType(operatorsType);
			val.setOperatorsName(operatorsName);
			val.setNote(note);
			val.setState(CmConstants.RecordState.USE);
			sv.saveOperators(new IBOBsOperatorsValue[] { val });

		}
	}

}
