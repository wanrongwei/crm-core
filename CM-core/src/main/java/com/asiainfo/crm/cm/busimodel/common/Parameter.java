package com.asiainfo.crm.cm.busimodel.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ParameterInfo
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午3:26:37
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public class Parameter implements Serializable {

	private static final long serialVersionUID = 219162135242229640L;

	/**目标表BO或者查询BO对应的Bean*/
	private Class beanClass = null;

	/** 业务编码 */
	private long businessId = 0l;

	/**拼接成的sql*/
	private String condition = "";

	/**参数集合*/
	private Map parameter = new HashMap();

	public Parameter() {
		super();
	}

	public Parameter(Class beanClass, String condition, HashMap parameter) {
		super();
		this.beanClass = beanClass;
		this.condition = condition;
		this.parameter = parameter;
	}

	public Parameter(String condition, HashMap parameter) {
		super();
		this.condition = condition;
		this.parameter = parameter;
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public long getBusinessId() {
		return businessId;
	}

	public String getCondition() {
		return condition;
	}

	public Map getParameter() {
		return parameter;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setParameter(Map parameter) {
		this.parameter = parameter;
	}

	public String getBusiDetail() throws Exception {
		StringBuilder busiDetail = new StringBuilder();
		// 查询条件：
		busiDetail.append(CrmLocaleFactory.getResource("CMS0030004")).append(":");
		Iterator iterator = this.parameter.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			busiDetail.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
		}
		if (busiDetail.toString().endsWith(",")) {
			busiDetail.deleteCharAt(busiDetail.toString().length() - 1);
		}
		// 拼上查询的目标表
		if (this.beanClass != null) {
			busiDetail.append(";\n");
			// Table/SQL：
			busiDetail.append("Table/SQL:");
			ObjectType objectType = ServiceManager.getObjectTypeFactory().getInstance(getBoNameFromBeanClass(beanClass));
			if ("table".equals(objectType.getMapingEntyType())) {
				busiDetail.append("SELECT * FROM ").append(objectType.getMapingEnty()).append(" M WHERE ");
			} else {
				busiDetail.append("SELECT * FROM (").append(objectType.getMapingEnty()).append(" ) M WHERE ");
			}
			busiDetail.append(this.condition);
		}
		return busiDetail.toString();
	}

	private String getBoNameFromBeanClass(Class beanClass) throws Exception {
		return beanClass.getName().substring(0, beanClass.getName().lastIndexOf("Bean"));
	}

	public void put(String key, Object value) {
		if (this.parameter == null) {
			this.parameter = new HashMap();
		}
		this.parameter.put(key, value);
	}
}
