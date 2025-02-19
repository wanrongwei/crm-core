package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-16 下午1:34:30
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public abstract class ValueObjectBean implements IValueObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3701873625563906523L;

	/**
	 * 属性
	 */
	private List<DataContainerInterface> attrValues = new ArrayList<DataContainerInterface>();

	/**
	 * 用户对象Map
	 */
	private Map<Object, Object> userObjectMap = new HashMap<Object, Object>();

	public void addAttrValue(DataContainerInterface attrValue) throws Exception {
		if (attrValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.attrValues.add(attrValue);
	}

	public void addAttrValues(DataContainerInterface[] attrValues) throws Exception {
		if (attrValues != null && attrValues.length > 0) {
			this.attrValues.addAll(Arrays.asList(attrValues));
		}
	}

	public void addUserMap(Map<Object, Object> userMap) throws Exception {
		if (userMap == null || userMap.size() == 0) {
			return;
		}
		this.userObjectMap.putAll(userMap);
	}

	public DataContainerInterface[] getAttrValues() throws Exception {
		if (this.attrValues.size() > 0) {
			return this.attrValues.toArray(new DataContainerInterface[0]);
		}
		return null;
	}

	public long getBusinessId() throws Exception {
		return DataType.getAsLong(this.userObjectMap.get(S_BUSINESS_ID));
	}

	public Map<Object, Object> getUserMap() {
		return this.userObjectMap;
	}

	public Object getUserObject(Object key) {
		return this.userObjectMap.get(key);
	}

	public Object[] getUserObjects() {
		if (this.hasUserObjects()) {
			return this.userObjectMap.values().toArray(new Object[0]);
		}
		return null;
	}

	public boolean hasAttrValues() {
		return this.attrValues.size() > 0;
	}

	public boolean hasBusinessId() {
		return this.userObjectMap.containsKey(S_BUSINESS_ID);
	}

	public boolean hasUserObject(Object key) {
		return this.userObjectMap.containsKey(key);
	}

	public boolean hasUserObjects() {
		return this.userObjectMap.size() > 0;
	}

	public DataContainerInterface removeAttrValue(DataContainerInterface attrValue) throws Exception {
		if (attrValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		if (this.attrValues.remove(attrValue)) {
			return attrValue;
		}
		return null;
	}

	public Object removeUserObject(Object key) throws Exception {
		return this.userObjectMap.remove(key);
	}

	public void setBusinessId(long businessId) throws Exception {
		this.userObjectMap.put(S_BUSINESS_ID, businessId);
	}

	public void setUserObject(Object key, Object value) throws Exception {
		if (key == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.userObjectMap.put(key, value);
	}
}
