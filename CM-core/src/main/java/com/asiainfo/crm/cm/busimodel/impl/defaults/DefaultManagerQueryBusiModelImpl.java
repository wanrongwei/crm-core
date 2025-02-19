package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.manager.AbstractManagerQueryBusiModelImpl;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmManagerBean;
import com.asiainfo.crm.cm.inner.manager.bo.QBOCmManagerBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmManagerValue;

public class DefaultManagerQueryBusiModelImpl extends AbstractManagerQueryBusiModelImpl {

	protected Parameter buildParameter(DataContainer[] parsedCriteria) throws Exception {
		Class targetBOBeanClass = BOCmManagerBean.class;
		Map map = ParamUtil.transferDataContainersToMap(parsedCriteria);
		if ((map.containsKey(QBOCmManagerBean.S_Code) && StringUtils.isNotBlank(DataType.getAsString(map.get(QBOCmManagerBean.S_Code))))
				|| (map.containsKey(QBOCmManagerBean.S_OrganizeName) && StringUtils.isNotBlank(DataType.getAsString(map.get(QBOCmManagerBean.S_OrganizeName))))) {
			targetBOBeanClass = QBOCmManagerBean.class;
		} else if (map.containsKey("USER_DEFINED_QBO_CLASS") && StringUtils.isNotBlank(DataType.getAsString(map.get("USER_DEFINED_QBO_CLASS")))) {
			targetBOBeanClass = Class.forName(StringUtils.trim(DataType.getAsString(map.get("USER_DEFINED_QBO_CLASS"))));
		}
		return ParamUtil.buildParameter(map, targetBOBeanClass, new String[] { QBOCmManagerBean.S_StaffName, QBOCmManagerBean.S_Code, QBOCmManagerBean.S_OrganizeName });
	}

	protected Parameter buildParameterBatch(long[] keys) throws Exception {
		Parameter parameter = ParamUtil.buildInParameter(keys, IBOCmManagerValue.S_StaffId);
		parameter.setBeanClass(QBOCmManagerBean.class);
		return parameter;
	}
}
