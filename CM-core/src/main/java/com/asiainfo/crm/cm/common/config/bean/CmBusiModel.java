package com.asiainfo.crm.cm.common.config.bean;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;

public class CmBusiModel implements Serializable {

	private static transient Log log = LogFactory.getLog(CmBusiModel.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1226830783715305832L;

	private int id = 0;

	private String interfaceName = null;

	private String implClass = null;

	private String regionId = null;

	private String remarks = null;

	private String string = null;

	public String toString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public CmBusiModel() {
	}

	public CmBusiModel(int id, String interfaceName, String implClass, String regionId, String remarks) {
		this.id = id;
		this.interfaceName = interfaceName;
		this.implClass = implClass;
		this.regionId = regionId;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getImplClass() {
		return implClass;
	}

	public void setImplClass(String implClass) {
		this.implClass = implClass;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void validate() throws Exception {
		if (StringUtils.isBlank(interfaceName) || StringUtils.isBlank(implClass) || StringUtils.isBlank(this.regionId)) {
			// 系统参数配置错误：序列生成器的服务和方法不能为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource(""));
			}
			ExceptionUtil.throwBusinessException("");
		}
	}
}
