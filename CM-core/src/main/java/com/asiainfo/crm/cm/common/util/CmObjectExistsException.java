package com.asiainfo.crm.cm.common.util;

import com.ai.common.i18n.BusinessException;

public class CmObjectExistsException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7288276547341980639L;

	private Object object = null;

	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(Object object) {
		this.object = object;
	}

	/**
	 * @param key
	 * @param object
	 */
	public CmObjectExistsException(String key, Object object) {
		super(key);
		this.setObject(object);
	}

	/**
	 * @param key
	 * @param args
	 * @param object
	 */
	public CmObjectExistsException(String key, Object[] args, Object object) {
		super(key, args);
		this.setObject(object);
	}

	/**
	 * @param key
	 * @param cause
	 * @param object
	 */
	public CmObjectExistsException(String key, Throwable cause, Object object) {
		super(key, cause);
		this.setObject(object);
	}

	/**
	 * @param key
	 * @param args
	 * @param cause
	 * @param object
	 */
	public CmObjectExistsException(String key, Object args[], Throwable cause, Object object) {
		super(key, args, cause);
		this.setObject(object);
	}
}
