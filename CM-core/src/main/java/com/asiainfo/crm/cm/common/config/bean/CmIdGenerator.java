package com.asiainfo.crm.cm.common.config.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-6-22 下午2:30:07
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-6-22     huzq           v1.0.0               修改原因<br>
 */
public class CmIdGenerator implements Serializable {

	/**   
	 * 方法的定义
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmIdGenerator
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 下午2:29:59
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	public static class Method implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7436059381903336193L;

		private boolean isStatic = true;

		private String name = null;

		private List<Parameter> parameterList = new ArrayList<Parameter>();

		private String remarks = null;

		private String string = null;

		public Method() {
		}

		public Method(String name, boolean isStatic, String remarks) {
			this.name = name;
			this.isStatic = isStatic;
			this.remarks = remarks;
		}

		public void addParameter(Parameter parameter) {
			this.parameterList.add(parameter);
		}

		public void addParameter(String name, String dataType, String source, String remarks) {
			this.parameterList.add(new Parameter(name, dataType, source, remarks));
		}

		public String getName() {
			return name;
		}

		public Parameter[] getParameters() {
			return this.parameterList.toArray(new Parameter[0]);
		}

		public String getRemarks() {
			return remarks;
		}

		/**   
		 * 是否含有参数
		 * @Function hasParameters
		 * @Description 
		 *
		 * @return
		 *
		 * @version v1.0.0
		 * @author huzq
		 * @date 2012-6-23 上午9:33:17
		 * 
		 * <strong>Modification History:</strong><br>
		 * Date         Author          Version            Description<br>
		 * ---------------------------------------------------------<br>
		 * 2012-6-23     huzq           v1.0.0               修改原因<br>
		 */
		public boolean hasParameters() {
			return CmCommonUtil.isNotEmptyObject(parameterList);
		}

		public boolean isStatic() {
			return isStatic;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public void setStatic(boolean isStatic) {
			this.isStatic = isStatic;
		}

		public void setString(String string) {
			this.string = string;
		}

		public String toString() {
			return string;
		}

		public void validate() throws Exception {
			if (StringUtils.isBlank(this.getName())) {
				// 系统参数配置错误：序列生成器的方法名称不能为空！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource(""));
				}
				ExceptionUtil.throwBusinessException("");
			}
			if (hasParameters()) {
				Iterator<Parameter> iterator = parameterList.iterator();
				while (iterator.hasNext()) {
					Parameter parameter = (Parameter) iterator.next();
					parameter.validate();
				}
			}
		}
	}

	/**   
	 * 参数
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmIdGenerator
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 下午2:52:31
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	public static class Parameter implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6502477839475429111L;
		public static final String SOURCE_PARAMETER = "parameter";
		public static final String SOURCE_SESSION = "session";

		private String dataType = null;

		private String name = null;

		private String remarks = null;

		private String source = null;

		private String string = null;

		public Parameter() {
		}

		public Parameter(String name, String dataType, String source, String remarks) {
			this.name = name;
			this.dataType = dataType;
			this.source = source;
			this.remarks = remarks;
		}

		public String getDataType() {
			return dataType;
		}

		public String getName() {
			return name;
		}

		public String getRemarks() {
			return remarks;
		}

		public String getSource() {
			return source;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public void setString(String string) {
			this.string = string;
		}

		public String toString() {
			return string;
		}

		public void validate() throws Exception {
			if (StringUtils.isBlank(this.getName()) || StringUtils.isBlank(this.getDataType()) || StringUtils.isBlank(this.getSource())) {
				// 系统参数配置错误：序列生成器方法参数的参数名称、数据类型和数据来源不能为空！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource(""));
				}
				ExceptionUtil.throwBusinessException("");
			}
		}
	}

	/**   
	 * 服务的定义
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmIdGenerator
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-22 下午2:30:14
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-6-22     huzq           v1.0.0               修改原因<br>
	 */
	public static class Service implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1759811603052313077L;
		public static final String MODIFIER_PRIVATE = "private";
		public static final String MODIFIER_PUBLIC = "public";

		private String modifier = null;

		/**
		 * 
		 */
		private String name = null;

		private String remarks = null;

		private String string = null;

		public Service() {
		}

		public Service(String name, String modifier, String remarks) {
			this.name = name;
			this.modifier = modifier;
			this.remarks = remarks;
		}

		public String getModifier() {
			return modifier;
		}

		public String getName() {
			return name;
		}

		public String getRemarks() {
			return remarks;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		public void setString(String string) {
			this.string = string;
		}

		public String toString() {
			return string;
		}

		public void validate() throws Exception {
			if (StringUtils.isBlank(this.getName()) || StringUtils.isBlank(this.getModifier())) {
				// 系统参数配置错误：序列生成器服务的服务名称和服务访问类型不能为空！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource(""));
				}
				ExceptionUtil.throwBusinessException("");
			}
			if (!StringUtils.equals(this.getModifier(), MODIFIER_PRIVATE) && !StringUtils.equals(this.getModifier(), MODIFIER_PUBLIC)) {
				// 系统参数配置错误：序列生成器服务的访问类型配置错误！
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource(""));
				}
				ExceptionUtil.throwBusinessException("");
			}
		}

	}

	private static transient Log log = LogFactory.getLog(CmIdGenerator.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 4452385318506329229L;

	private String id = null;

	/**
	 * 方法
	 */
	private Method method = new Method();

	private String remarks = null;

	/**
	 * 服务
	 */
	private Service service = new Service();

	private String string = null;

	public CmIdGenerator() {
	}

	public CmIdGenerator(String id, String remarks) {
		this.id = id;
		this.remarks = remarks;
	}

	public void addMethodParameter(String name, String dataType, String source, String remarks) {
		this.method.addParameter(name, dataType, source, remarks);
	}

	public String getId() {
		return id;
	}

	public Method getMethod() {
		return method;
	}

	public String getRemarks() {
		return remarks;
	}

	public Service getService() {
		return service;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMethod(String name, boolean isStatic, String remarks) {
		this.method.setName(name);
		this.method.setStatic(isStatic);
		this.method.setRemarks(remarks);
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setService(String name, String modifier, String remarks) {
		this.service.setName(name);
		this.service.setModifier(modifier);
		this.service.setRemarks(remarks);
	}

	public void setString(String string) {
		this.string = string;
	}

	public String toString() {
		return string;
	}

	public void validate() throws Exception {
		if (StringUtils.isBlank(this.getId())) {
			// 系统参数配置错误：序列生成器的ID不能为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource(""));
			}
			ExceptionUtil.throwBusinessException("");
		}
		if (this.getService() == null || this.getMethod() == null) {
			// 系统参数配置错误：序列生成器的服务和方法不能为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource(""));
			}
			ExceptionUtil.throwBusinessException("");
		}
		this.getService().validate();
		this.getMethod().validate();
	}
}
