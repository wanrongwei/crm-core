package com.asiainfo.crm.cm.model.bean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.model.ivalues.ICmReturnData;

public class CmReturnDataBean implements ICmReturnData {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8902708233795266779L;

	private String resultCode;
	private String msgKey;
	private String msg;
	private Object[] params;

	/**
	 * 用户对象Map
	 */
	private Map<Object, Object> userObjectMap = new HashMap<Object, Object>();

	public void setResultCode(String code) {
		this.resultCode = code;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultMsg(String msg) {
		this.msg = msg;
	}

	public void setResultMsgByKey(String key) {
		this.msgKey = key;
	}

	public void setResultMsgByKey(String key, Object[] params) {
		this.msgKey = key;
		this.params = params;
	}

	public String getResultMsg() {
		if (StringUtils.isNotBlank(this.msg)) {
			return this.msg;
		}
		return CrmLocaleFactory.getResource(msgKey, params);
	}

	public String getResultMsgKey() {
		return this.msgKey;
	}

	public Object[] getResultParams() {
		return params;
	}

	public void setUserObject(Object key, Object value) {
		this.userObjectMap.put(key, value);
	}

	public Map<Object, Object> getUserMap() {
		return userObjectMap;
	}

	public Object getUserObject(Object key) {
		return this.userObjectMap.get(key);
	}

}
