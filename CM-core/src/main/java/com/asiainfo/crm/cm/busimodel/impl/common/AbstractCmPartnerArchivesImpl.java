package com.asiainfo.crm.cm.busimodel.impl.common;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.cp.bo.BOCmAgentPartnerInfoBean;
import com.asiainfo.crm.cm.cp.bo.BOCmPartnerBusiInfoBean;
import com.asiainfo.crm.cm.cp.bo.BOCmPartnerInfoBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class AbstractCmPartnerArchivesImpl implements IQueryCountBusiModel,
		IQueryDataBusiModel {

	public final void savePartnerArchives(DataContainer[] values)
			throws Exception {
		for (int i = 0; i < values.length; i++) {
			// 设置主键
			if (values[i].isNew()) {
				// 设置主键
//				((BOCmPartnerInfoBean) values[i])
//						.setPartnerId(CmCommonUtil
//								.getNewSequence(BOCmPartnerInfoBean.class));
				//---------
				//先默认省为辽宁 20000240
				((BOCmPartnerInfoBean) values[i]).setProvId(240);
				//片区默认 240100
				if(0==((BOCmPartnerInfoBean)values[i]).getPartId())
				{
					((BOCmPartnerInfoBean) values[i]).setPartId(240100);
				}
				////
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}

	/**
	 * 查询集团基本信息的时候用到了，公共的调用底层方法
	 */
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

	public void savePartnerServiceArchives(DataContainer[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			// 设置主键
//			if (values[i].isNew()) {
//				// 设置主键
//				((BOCmPartnerBusiInfoBean) values[i])
//						.setBusiId(CmCommonUtil
//								.getNewSequence(BOCmPartnerBusiInfoBean.class));
//			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}	
	}

	public void savePartnerServiceAgentArchives(DataContainer[] values) throws Exception {
		for (int i = 0; i < values.length; i++) {
			// 设置主键
			if (values[i].isNew()) {
				// 设置主键
				((BOCmAgentPartnerInfoBean) values[i])
						.setDependentId(CmCommonUtil
								.getNewSequence(BOCmAgentPartnerInfoBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
		
	}
}

