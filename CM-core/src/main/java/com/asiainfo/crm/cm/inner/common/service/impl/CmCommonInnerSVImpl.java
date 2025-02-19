package com.asiainfo.crm.cm.inner.common.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.inner.common.dao.interfaces.ICmCommonInnerDAO;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.ln.common.bo.BOLnCmInsCmRelEngine;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;

/** 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName 
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-19 下午4:16:19
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
 */
public class CmCommonInnerSVImpl implements ICmCommonInnerSV {

	private ICmCommonInnerDAO getCommonInnerDAO() {
		return (ICmCommonInnerDAO) ServiceFactory.getService(ICmCommonInnerDAO.class);
	}

	public void saveBeans(DataContainerInterface[] beans) throws Exception {
		getCommonInnerDAO().saveBeans(beans);
	}

	public DataContainerInterface[] getBeans(Class beanClass, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return getCommonInnerDAO().getBeans(beanClass, condition, parameter, startNum, endNum);
	}
	
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId, long userId, int start, int end) throws Exception{
		if (custId <= 0 && userId <= 0) {
			ExceptionUtil.throwBusinessException("CMS5000001");
		}
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_State).append(" <>:state ");
		parameter.put("state", Integer.valueOf(0));
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_EffectiveDate).append(" <= now() ");
		condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_ExpireDate).append(" >= now() ");
		if (custId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_CustId).append(" =:CUST_ID ");
			parameter.put("CUST_ID", Long.valueOf(custId));
		}
		if (userId > 0) {
			condition.append(" AND ").append(IBOLnCmInsCmRelValue.S_UserId).append(" =:userId ");
			parameter.put("userId", userId);
		}
		return (IBOLnCmInsCmRelValue[]) BOLnCmInsCmRelEngine.getBeans(condition.toString(), parameter);
	}

	public DataContainerInterface getBean(DataContainerInterface bean) throws Exception {
		return getCommonInnerDAO().getBean(bean);
	}

	public void saveBean(DataContainerInterface bean) throws Exception {
		getCommonInnerDAO().saveBean(bean);
	}

	public int getBeanCount(Class beanClass, String condition, Map parameter) throws Exception {
		return getCommonInnerDAO().getBeanCount(beanClass, condition, parameter);
	}

	public DataContainerInterface[] getBeansFromQueryBO(Class beanClass, String soureBO, Map parameter) throws Exception {
		return getCommonInnerDAO().getBeansFromQueryBO(beanClass, soureBO, parameter);
	}

	public DataContainerInterface[] getBeans(Class beanClass, String[] cols, String condition, Map parameter, int startNum, int endNum, boolean fkFlag) throws Exception {
		return getCommonInnerDAO().getBeans(beanClass, cols, condition, parameter, startNum, endNum, fkFlag);
	}

	public DataContainerInterface[] getBeansFromSql(Class beanClass, String sql, Map parameter) throws Exception {
		return getCommonInnerDAO().getBeansFromSql(beanClass, sql, parameter);
	}
	public int getBeansFromSqlCount(Class beanClass, String sql, Map parameter) throws Exception{
		return getCommonInnerDAO().getBeanCount(beanClass, sql, parameter);
	}
	public DataContainerInterface[] queryData(Class beanClass, DataContainer param, String extCondition) throws Exception {
		if (!DataContainer.class.isAssignableFrom(beanClass) || !beanClass.getName().endsWith("Bean")) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		Set props = new HashSet();
		for (String prop : ((DataContainer) beanClass.newInstance()).getPropertyNames()) {
			props.add(prop);
		}
		StringBuilder cond = new StringBuilder(" 1=1 ");
		HashMap paramMap = new HashMap();
		if (param != null) {
			for (Iterator iterator = param.getProperties().entrySet().iterator(); iterator.hasNext();) {
				Map.Entry o = (Map.Entry) iterator.next();
				String key = o.getKey().toString().toUpperCase();
				Object value = o.getValue();
				if (props.contains(key) && value != null && StringUtils.isNotBlank(value.toString())) {
					cond.append(" AND ").append(key).append(" =:").append(key).append(" ");
					paramMap.put(key, value.toString().trim());
				}
			}
		}
		if (StringUtils.isNotBlank(extCondition)) {
			if (extCondition.toUpperCase().trim().startsWith("ORDER BY ") || extCondition.toUpperCase().trim().startsWith("GROUP BY ")) {
				cond.append(" ").append(extCondition).append(" ");
			} else {
				cond.append(" AND ( ").append(extCondition).append(" ) ");
			}
		}
		return getCommonInnerDAO().getBeans(beanClass, cond.toString(), paramMap, -1, -1);
	}

	public int getBeanCount(Parameter parameter) throws Exception {
		if (parameter.getBeanClass() == null) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		return getCommonInnerDAO().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}

	public DataContainerInterface[] getBeans(Parameter parameter, int startNum, int endNum) throws Exception {
		if (parameter.getBeanClass() == null) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		return getCommonInnerDAO().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum, endNum);
	}

}
