package com.asiainfo.crm.cm.common.util;

import com.ai.common.i18n.BusinessException;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-22 下午10:13:57
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-22     huzq2           v1.0.0               修改原因<br>
 */
public class CmObjectNotFoundException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1175699938850786647L;

	/**
	 * @param key
	 * @param args
	 * @param cause
	 */
	public CmObjectNotFoundException(String key, Object[] args, Throwable cause) {
		super(key, args, cause);
	}

	/**
	 * @param key
	 * @param args
	 */
	public CmObjectNotFoundException(String key, Object[] args) {
		super(key, args);
	}

	/**
	 * @param key
	 * @param cause
	 */
	public CmObjectNotFoundException(String key, Throwable cause) {
		super(key, cause);
	}

	/**
	 * @param key
	 */
	public CmObjectNotFoundException(String key) {
		super(key);
	}

}
