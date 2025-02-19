package com.asiainfo.crm.cm.busimodel.impl.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmVipElementBean;
import com.asiainfo.crm.cm.inner.club.bo.BOCmVipElementEngine;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmVipElementValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class AbstractCmClubManagerImpl implements IQueryCountBusiModel,IQueryDataBusiModel {

	public DataContainer[] queryData(String criteria, int startNum, int endNum)
			throws Exception {
		return queryData(ParamUtil.parseXmlCriteria(criteria), startNum, endNum);
	}

	public final DataContainer[] queryData(DataContainer[] conditionDCs,
			int startNum, int endNum) throws Exception {
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		DataContainerInterface[] values = CmInnerServiceFactory
				.getCommonInnerSV().getBeans(parameter.getBeanClass(),
						parameter.getCondition(), parameter.getParameter(),
						startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(values)) {
			return new DataContainer[0];
		}
		return (DataContainer[]) values;
	}

	public int queryCount(String criteria) throws Exception {
		return queryCount(ParamUtil.parseXmlCriteria(criteria));
	}

	public final int queryCount(DataContainer[] conditionDCs) throws Exception {
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(
				parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter());
	}

	public Parameter buildQueryCondition(DataContainer[] conditionDCs)
			throws Exception {
		Parameter parameter = ParamUtil.buildParameter(
				new DataContainer[] { conditionDCs[0] }, conditionDCs[0]
						.getClass());
		/*
		 * StringBuilder condition = new StringBuilder();
		 * condition.append(IBOCmClubValue.S_State).append(" = :state
		 * ").append(" AND ").append(parameter.getCondition());
		 * parameter.setCondition(condition.toString());
		 * parameter.getParameter().put("state", CmConstants.RecordState.USE);
		 */
		return parameter;
	}

	public DataContainerInterface[] queryData(String[] cols,
			DataContainer[] criteria, int startNum, int endNum)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveClubMemberArchives(DataContainer[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}

	public void saveClubMember(DataContainer[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}

	
	public BOCmVipElementBean queryFromBillId(String billId) throws Exception {
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		if (null != billId && !StringUtils.isBlank(billId)) {
			condition.append("and " + IBOCmVipElementValue.S_BillId
					+ "  = :billId ");
			paraMap.put("billId", billId);
		}
		BOCmVipElementBean[] bOCmVipElementBean = BOCmVipElementEngine.getBeans(condition.toString(),
				paraMap);
		if (CmCommonUtil.isNotEmptyObject(bOCmVipElementBean)) {
			return bOCmVipElementBean[0];
		}
		
		return null;
	}

	public IBOCmVipElementValue queryFromBillId(String billId, int vipType) throws Exception {
	    StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		Map<String, Object> paraMap = new HashMap<String, Object>();
		if (null != billId && !StringUtils.isBlank(billId)) {
			condition.append("and " + IBOCmVipElementValue.S_BillId
					+ "  = :billId ");
			paraMap.put("billId", billId);
			condition.append("and " + IBOCmVipElementValue.S_ElementType
				+ "  = :elementType ");
			paraMap.put("elementType", vipType);
		}
		BOCmVipElementBean[] bOCmVipElementBean = BOCmVipElementEngine.getBeans(condition.toString(),
				paraMap);
		if (CmCommonUtil.isNotEmptyObject(bOCmVipElementBean)) {
			return bOCmVipElementBean[0];
		}
		return null;
	}
}