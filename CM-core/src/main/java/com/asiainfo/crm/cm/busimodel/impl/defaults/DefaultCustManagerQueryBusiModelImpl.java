/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: DefaultCustManagerQueryBusiModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-12 上午11:26:16
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-12 LSC v1.0.0 修改原因
 */

package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustManagerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivManagerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public class DefaultCustManagerQueryBusiModelImpl extends AbstractCustManagerQueryBusiModelImpl {

	private transient static Log log = LogFactory.getLog(DefaultCustManagerQueryBusiModelImpl.class);

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		if (!CmCommonUtil.isNotEmptyObject(conditionDCs)) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030039", ""));
			}
			ExceptionUtil.throwBusinessException("CMS0030039", "");// 查询条件{0}不能为空！
		}
		Map paramMap = ParamUtil.transferDataContainersToMap(conditionDCs);
		if (!paramMap.containsKey(ICustomerValue.S_CustType)) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0030039", ""));// 查询条件{0}不能为空！
			}
			ExceptionUtil.throwBusinessException("CMS0030039", CrmLocaleFactory.getResource(""));// 查询条件客户类型不能为空！
		}
		int custType = DataType.getAsInt(paramMap.get(ICustomerValue.S_CustType));
		Class beanClass = null;
		switch (custType) {
			case CmConstants.CustomerType.INDIVIDUAL:
				beanClass = BOCmIndivManagerBean.class;
				break;
			case CmConstants.CustomerType.GROUP:
				beanClass = BOCmGroupManagerBean.class;
				break;
			default:
				// 不存在此种客户类型
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0030044", String.valueOf(custType)));
				}
				ExceptionUtil.throwBusinessException("CMS0030044", String.valueOf(custType));
				break;
		}
		Parameter parameter = ParamUtil.buildParameter(paramMap, beanClass);
		return parameter;
	}

	protected DataContainer[] parseCriteria(String criteria) throws Exception {
		return ParamUtil.parseXmlCriteria(criteria);
	}
}
