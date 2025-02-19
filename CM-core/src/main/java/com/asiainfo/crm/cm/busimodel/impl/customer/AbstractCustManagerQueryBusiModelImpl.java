package com.asiainfo.crm.cm.busimodel.impl.customer;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmObjectWrapperFactory;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivManagerBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.CustManagerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractCustManagerQueryBusiModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-12 上午11:23:50
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-12 LSC v1.0.0 修改原因
 */
public abstract class AbstractCustManagerQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Class getReturnObjectClass() {
		return CustManagerBean.class;
	}

	/**
	 * 通过客户编码查询客户经理
	 * @param custId
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @param startNum 
	 * @param endNum 
	 * @date:2012-4-19
	 */
	public final ICustManagerValue[] queryCustManagerByCustId(long custId, String state, int startNum, int endNum) throws Exception {
		int custType = CmCommonUtil.getCustType(custId);
		CustManagerBean managerBean = new CustManagerBean();
		managerBean.setCustId(custId);
		managerBean.setRelType(CmConstants.relType.REL_TYPE_MAIN);
		managerBean.initProperty(ICustomerValue.S_CustType, custType);
		if (CmStaticDataUtil.isLegalStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state)) {
			managerBean.setState(state);
		}
		DataContainerInterface[] dcs = super.queryData(new DataContainer[] { managerBean }, startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(dcs)) {
			return new CustManagerBean[0];
		}
		// 封转客户经理信息
		wrapCustManager((DataContainerInterface[]) dcs);
		return (ICustManagerValue[]) dcs;
	}

	/**
	 * 通过一组客户编码查询客户经理
	 * @param custId
	 * @param custType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-19
	 */
	public final ICustManagerValue[] queryCustManagerByCustIds(long custId[], int custType, String state, int startNum, int endNum) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(custId, ICustManagerValue.S_CustId);
		switch (custType) {
			case CmConstants.CustomerType.INDIVIDUAL:
				parameter.setBeanClass(BOCmIndivManagerBean.class);
				break;
			case CmConstants.CustomerType.GROUP:
				parameter.setBeanClass(BOCmGroupManagerBean.class);
				break;
			default:
				// 不存在此种客户类型
				ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(custType));
		}
		// 记录业务日志
		saveQueryBusiLog(parameter);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum,
				endNum);
		if (!CmCommonUtil.isNotEmptyObject(dcs)) {
			return new CustManagerBean[0];
		}
		CustManagerBean[] custMgrValues = new CustManagerBean[dcs.length];
		for (int i = 0; i < custMgrValues.length; i++) {
			custMgrValues[i] = new CustManagerBean();
			custMgrValues[i].copy(dcs[i]);
		}
		// 封转客户经理信息
		wrapCustManager(custMgrValues);
		return custMgrValues;
	}

	/**   
	 * 根据客户编号查询客户经理数量
	 * @Function queryCustManagerCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午10:10:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public final int queryCustManagerCountByCustId(long custId, String state) throws Exception {
		int custType = CmCommonUtil.getCustType(custId);
		CustManagerBean managerBean = new CustManagerBean();
		managerBean.setCustId(custId);
		managerBean.initProperty(ICustomerValue.S_CustType, custType);
		if (CmStaticDataUtil.isLegalStaticData(CmConstants.CmStaticDataCodeType.RECORD_STATE, state)) {
			managerBean.setState(state);
		}
		return super.queryCount(new DataContainer[] { managerBean });
	}

	public final DataContainerInterface[] queryData(DataContainer[] parseCriteria, int startNum, int endNum) throws Exception {
		DataContainerInterface[] dcs = super.queryData(parseCriteria, startNum, endNum);
		// 封转客户经理信息
		wrapCustManager(dcs);
		return dcs;
	}

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CUSTOMER_LOG);
	}

	/**   
	 * 封装客户经理信息
	 * @Function wrapCustManager
	 * @Description 
	 *
	 * @param dcs
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午8:34:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	protected void wrapCustManager(DataContainerInterface[] dcs) throws Exception {
		// 封装查询客户经理的逻辑
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			long[] managerIds = new long[dcs.length];
			for (int i = 0; i < dcs.length; i++) {
				DataContainerInterface dc = dcs[i];
				managerIds[i] = dc.getAsLong(ICustManagerValue.S_ManagerId);
			}
			DataContainer[] managerValues = CmServiceFactory.getManagerSV().queryManagersByIds(managerIds);
			if (CmCommonUtil.isNotEmptyObject(managerValues)) {
				Map custManagerMap = new HashMap();
				for (int i = 0; i < managerValues.length; i++) {
					DataContainer managerValue = managerValues[i];
					custManagerMap.put(managerValue.getAsLong(ICustManagerValue.S_StaffId), managerValue);
				}
				for (int i = 0; i < dcs.length; i++) {
					if (custManagerMap.containsKey(dcs[i].getAsLong(ICustManagerValue.S_ManagerId))) {
						DataContainer managerDc = (DataContainer) custManagerMap.get(dcs[i].getAsLong(ICustManagerValue.S_ManagerId));
						String[] colNames = managerDc.getPropertyNames();
						for (int j = 0; j < colNames.length; j++) {
							String colName = colNames[j];
							// 只拷贝custMgrValues不存在的属性，避免使用平台的DataFactory.copyNoClear导致关系上的日志属性被覆盖
							if (dcs[i].get(colName) == null) {
								dcs[i].initProperty(colName, managerDc.get(colName));
							}
						}
					}
					CmObjectWrapperFactory.wrap(dcs[i]);
				}
			}
		}
	}
}
