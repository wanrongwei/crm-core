package com.asiainfo.crm.cm.common.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.bo.BOCmAttachExColEngine;
import com.asiainfo.crm.cm.common.bo.BOCmAttachExporClassEngine;
import com.asiainfo.crm.cm.common.bo.BOCmCfgBusiModelEngine;
import com.asiainfo.crm.cm.common.bo.BOCmCfgSpecListTypeBean;
import com.asiainfo.crm.cm.common.bo.BOCmCfgSpecListTypeEngine;
import com.asiainfo.crm.cm.common.bo.BOCmCfgSpecListTypeRelBean;
import com.asiainfo.crm.cm.common.bo.BOCmCfgTableAttrEngine;
import com.asiainfo.crm.cm.common.bo.BOCmCreditMappingEngine;
import com.asiainfo.crm.cm.common.bo.BOCmKernelClassCfgEngine;
import com.asiainfo.crm.cm.common.bo.BOCmVipScoreRuleEngine;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCommonDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExColValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgBusiModelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeRelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgTableAttrValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmKernelClassCfgValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmVipScoreRuleValue;
import com.asiainfo.crm.cm.customer.group.bo.BOCmIndustryConfigEngine;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmIndustryConfigValue;
import com.asiainfo.crm.cm.custview.bo.BOCmOperFieldRelEngine;
import com.asiainfo.crm.cm.custview.ivalues.IBOCmOperFieldRelValue;

public class CmCommonDAOImpl implements ICmCommonDAO {

	public IBOCmCfgBusiModelValue[] getAllBusiModels() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(" 1=1 ").append(" AND ").append(IBOCmCfgBusiModelValue.S_State).append(" =:state ");

		Map map = new HashMap();
		map.put("state", CmConstants.RecordState.USE);

		return BOCmCfgBusiModelEngine.getBeans(sb.toString(), map);
	}

	public long getNewSequence(Class claz) throws Exception {
		long sequence = 0;
		if (claz != null) {
			// 传入的类-[{0}]-没有实现接口-[{1}]-无法获得sequence
			if (!ClassUtils.isAssignable(claz, DataContainerInterface.class)) {
				ExceptionUtil.throwBusinessException("AMS0700055", claz.getName(), DataContainerInterface.class.getName());
			}
			ObjectType objectType = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(claz);
			String mapingEntyType = objectType.getMapingEntyType();
			if (StringUtils.isBlank(mapingEntyType)) {
				// 传入的类无法获取mapingEntyType，无法获取sequence
				ExceptionUtil.throwBusinessException("AMS0700057");
			} else if ("query".equalsIgnoreCase(mapingEntyType)) {
				// 传入的类的mapingEntyType为query，查询BO无法获取sequence
				ExceptionUtil.throwBusinessException("AMS0700058");
			} else {
				sequence = ServiceManager.getIdGenerator().getNewId(objectType).longValue();
			}
		} else {
			// 传入的类为空，无法获取sequence
			ExceptionUtil.throwBusinessException("AMS0700056");
		}
		return sequence;
	}

	public IBOCmCfgSpecListTypeValue[] getCfgSpecListTypes(String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmCfgSpecListTypeEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public IBOCmCfgSpecListTypeValue[] getIncompatibleSpecListTypes(int typeId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("SELECT * FROM ").append(BOCmCfgSpecListTypeBean.getObjectTypeStatic().getMapingEnty());
		condition.append(" WHERE ");
		condition.append(IBOCmCfgSpecListTypeValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IBOCmCfgSpecListTypeValue.S_TypeId).append(" IN (");
		condition.append("SELECT ").append(IBOCmCfgSpecListTypeRelValue.S_TypeId).append(" FROM ");
		condition.append(BOCmCfgSpecListTypeRelBean.S_TYPE.getMapingEnty()).append(" WHERE ");
		condition.append(IBOCmCfgSpecListTypeRelValue.S_RelTypeId).append(" = :relTypeId ");
		condition.append(" AND ").append(IBOCmCfgSpecListTypeRelValue.S_State).append(" = :relState ");
		condition.append(") OR ").append(IBOCmCfgSpecListTypeValue.S_TypeId).append(" IN (");
		condition.append("SELECT ").append(IBOCmCfgSpecListTypeRelValue.S_RelTypeId).append(" FROM ");
		condition.append(BOCmCfgSpecListTypeRelBean.S_TYPE.getMapingEnty()).append(" WHERE ");
		condition.append(IBOCmCfgSpecListTypeRelValue.S_TypeId).append(" = :typeId ");
		condition.append(" AND ").append(IBOCmCfgSpecListTypeRelValue.S_State).append(" = :relState )");
		parameter.put("relTypeId", typeId);
		parameter.put("typeId", typeId);
		parameter.put("relState", CmConstants.RecordState.USE);
		return BOCmCfgSpecListTypeEngine.getBeansFromSql(condition.toString(), parameter);
	}

	public IBOCmCfgTableAttrValue[] getAllCfgTableAttrs() throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmCfgTableAttrValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		return BOCmCfgTableAttrEngine.getBeans(condition.toString(), parameter);
	}

	public IBOCmCreditMappingValue[] getAllCreditMapping(String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmCreditMappingEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public IBOCmKernelClassCfgValue[] getAllKernelClass(String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmKernelClassCfgEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}
	
	public IBOCmIndustryConfigValue[] getAllIndustry(String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmIndustryConfigEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}
	
	public IBOCmIndustryConfigValue[] getIndustryByparentId(String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmIndustryConfigEngine.getBeans(null, condition, parameter, startNum, endNum, false);
	}

	public IBOCmVipScoreRuleValue[] getCmVipScoreRuleClass() throws Exception {
		return BOCmVipScoreRuleEngine.getBeans(null, null);
	}

	public IBOCmAttachExColValue[] getCmAttachExColClass() throws Exception {
		return BOCmAttachExColEngine.getBeans(null, null);
	}

	public IBOCmAttachExporClassValue[] getCmAttachExportValue() throws Exception {
		return BOCmAttachExporClassEngine.getBeans(null, null);
	}

	public IBOCmOperFieldRelValue[] queryOperField(long operId, long tabId) throws Exception {
		StringBuffer sql = new StringBuffer();
		Map map = new HashMap();
		sql.append(IBOCmOperFieldRelValue.S_State).append(" =:fieldState ");
		sql.append(" AND ").append(IBOCmOperFieldRelValue.S_OperId).append(" =:operId ");
		sql.append(" ORDER BY ").append(IBOCmOperFieldRelValue.S_Sort);

		map.put("fieldState", "U");
		map.put("operId", new Long(operId));

		return BOCmOperFieldRelEngine.getBeans(sql.toString(), map);
	}

}
