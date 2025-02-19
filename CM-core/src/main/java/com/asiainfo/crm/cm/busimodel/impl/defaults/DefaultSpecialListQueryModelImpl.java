/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: DefaultSpecialListQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-12 上午10:06:00
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-12 LSC v1.0.0 修改原因
 */
package com.asiainfo.crm.cm.busimodel.impl.defaults;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.evaluation.AbstractSpecialListQueryModelImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.evaluation.bo.BOCmSpecialListBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.SpecialListBean;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;

public class DefaultSpecialListQueryModelImpl extends AbstractSpecialListQueryModelImpl {

	protected ISpecialListValue querySpecialListById(long specialId) throws Exception {
		BOCmSpecialListBean bean = new BOCmSpecialListBean();
		bean.setSpecListId(specialId);
		DataContainerInterface dc = CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (CmCommonUtil.isNotEmptyObject(dc)) {
			ISpecialListValue specialListValue = new SpecialListBean();
			specialListValue.copy(dc);
			return specialListValue;
		}
		return null;
	}

	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(conditionDCs, BOCmSpecialListBean.class,new String[] { BOCmSpecialListBean.S_PartyName });
		return parameter;
	}

}
