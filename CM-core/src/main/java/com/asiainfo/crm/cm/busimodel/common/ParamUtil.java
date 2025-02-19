package com.asiainfo.crm.cm.busimodel.common;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Element;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.util.XmlUtil;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ParamUtil
 * @Description 拼查询条件的工具类
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午3:30:34
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public class ParamUtil {

	private static transient Log log = LogFactory.getLog(ParamUtil.class);

	/**   
	 * @Function buildParameter
	 * @Description 默认的构造查询条件方法。默认情况认为所有的查询条件都是等值比较，并且都是使用“AND”连接。
	 *
	 * @param parameterDCs 查询条件对象数组（平台的数据容器数组）
	 * @return 构造后的查询参数对象
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午2:05:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public static Parameter buildParameter(DataStructInterface[] parameterDCs) throws Exception {
		return buildParameter(parameterDCs, null);
	}

	/**   
	 * @Function buildParameter
	 * @Description 默认的构造查询条件方法。默认情况认为所有的查询条件都是等值比较，并且都是使用“AND”连接。
	 *
	 * @param parameterDCs 查询条件对象数组（平台的数据容器数组）
	 * @param targetBOBeanClass 参照的BOBean
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午3:32:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public static Parameter buildParameter(DataStructInterface[] parameterDCs, Class targetBOBeanClass) throws Exception {
		return buildParameter(parameterDCs, targetBOBeanClass, null);
	}

	// code by xiezhenglong

	/*
	 * 这个函数的作用是拼查询的xml格式 <?xml version="1.0" encoding="gb2312"?> <Parameters>
	 * <com.asiainfo.crm.cm.common.bo.BOFactoryInfoBean> <FACTORY_ID></FACTORY_ID> <NAME></NAME><FACTORY_TYPE>
	 * </FACTORY_TYPE> </com.asiainfo.crm.cm.common.bo.BOFactoryInfoBean> </Parameters> author xiezl 2012 07 20
	 */
	public static String buildQueryXml(String className, Map<String, String> parameters) {
		StringBuilder sb = new StringBuilder("");
		sb.append("<?xml version=\"1.0\" encoding=\"gb2312\"?>");
		sb.append("<Parameters>");
		sb.append("<" + className + ">");
		if (parameters != null) {
			Iterator<Map.Entry<String, String>> it = parameters.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<String, String> entry = it.next();
				sb.append("<" + entry.getKey().toUpperCase() + ">");
				sb.append(entry.getValue());
				sb.append("</" + entry.getKey().toUpperCase() + ">");
			}
		}
		sb.append("</" + className + ">");
		sb.append("</Parameters>");
		return sb.toString();
	}

	/**   
	 * 默认的构造查询条件方法。默认情况认为所有的查询条件都是等值比较，并且都是使用“AND”连接。（支持Like条件）
	 * @Function buildParameter
	 * @Description 
	 *
	 * @param parameterDCs 查询条件对象数组（平台的数据容器数组）
	 * @param targetBOBeanClass 参照的BOBean
	 * @param likeCdns
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午3:32:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public static Parameter buildParameter(DataStructInterface[] parameterDCs, Class targetBOBeanClass, String[] likeCdns) throws Exception {
		if (CmCommonUtil.isEmptyObject(parameterDCs)) {
			// 查询条件为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010044"));
			}
			ExceptionUtil.throwBusinessException("CMS0010044");
		}
		Map properties = new HashMap();
		for (int i = 0; i < parameterDCs.length; i++) {
			properties.putAll(parameterDCs[i].getProperties());
		}
		return buildParameter(properties, targetBOBeanClass, likeCdns);
	}

	/**   
	 * 构造查询条件
	 * @Function buildParameter
	 * @Description 
	 *
	 * @param parameterDsi
	 * @param targetBOBeanClass
	 * @param likeCdns
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-25 下午12:57:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-25     huzq           v1.0.0               修改原因<br>
	 */
	public static Parameter buildParameter(DataStructInterface parameterDsi, Class targetBOBeanClass, String[] likeCdns) throws Exception {
		if (CmCommonUtil.isEmptyObject(parameterDsi)) {
			// 查询条件为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010044"));
			}
			ExceptionUtil.throwBusinessException("CMS0010044");
		}
		return buildParameter(parameterDsi.getProperties(), targetBOBeanClass, likeCdns);
	}

	/**   
	 * 构造查询条件
	 * @Function buildParameter
	 * @Description 
	 *
	 * @param parameterDsi
	 * @param targetBOBeanClass
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-25 下午12:58:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-25     huzq           v1.0.0               修改原因<br>
	 */
	public static Parameter buildParameter(DataStructInterface parameterDsi, Class targetBOBeanClass) throws Exception {
		if (CmCommonUtil.isEmptyObject(parameterDsi)) {
			// 查询条件为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010044"));
			}
			ExceptionUtil.throwBusinessException("CMS0010044");
		}
		return buildParameter(parameterDsi.getProperties(), targetBOBeanClass, null);
	}

	/**   
	 * 默认的构造查询条件方法。默认情况认为所有的查询条件都是等值比较，并且都是使用“AND”连接。
	 * @Function buildParameter
	 * @Description 
	 *
	 * @param param
	 * @param targetBOBeanClass
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-25 下午8:57:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-25     huzq2           v1.0.0               修改原因<br>
	 */
	public static Parameter buildParameter(Map param, Class targetBOBeanClass) throws Exception {
		return buildParameter(param, targetBOBeanClass, null);
	}

	/**   
	 * 默认的构造查询条件方法。默认情况认为所有的查询条件都是等值比较，并且都是使用“AND”连接。(支持Like条件)
	 * @Function buildParameter
	 * @Description 
	 *
	 * @param param
	 * @param targetBOBeanClass
	 * @param likeCdns
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-30 上午10:06:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-30     huzq2           v1.0.0               修改原因<br>
	 */
	public static Parameter buildParameter(Map param, Class targetBOBeanClass, String[] likeCdns) throws Exception {
		Map likeProperties = new HashMap();
		if (CmCommonUtil.isNotEmptyObject(likeCdns)) {
			for (int i = 0; i < likeCdns.length; i++) {
				likeProperties.put(likeCdns[i], likeCdns[i]);
			}
		}
		Parameter paramInfo = new Parameter();
		StringBuffer condition = new StringBuffer();
		condition.append(" 1=1 ");
		// 如果告知了参照的BO，则需要排除不在BO中的字段，否则会出现字段找不到的异常。
		if (targetBOBeanClass != null && ClassUtils.isAssignable(targetBOBeanClass, DataContainer.class)) {
			DataContainer targetBo = (DataContainer) DataContainerFactory.createDataContainerInstance(targetBOBeanClass, null);
			if (!DataContainer.class.equals(targetBOBeanClass)) {
				paramInfo.setBeanClass(targetBOBeanClass);
			}
			String[] propNames = targetBo.getType().getPropertyNames();

			for (int i = 0; i < propNames.length; i++) {
				if (param.containsKey(propNames[i])) {
					// 跳过为空的条件
					if (StringUtils.isBlank(String.valueOf(param.get(propNames[i])))) {
						continue;
					}
					// 跳过数字类型的值为-1的条件
					if ("-1".equalsIgnoreCase(String.valueOf(param.get(propNames[i])))) {
						continue;
					}
					// 如果属性在like查询条件中，则拼接为like条件
					if (likeProperties.containsKey(propNames[i])) {
						String paramValue = param.get(propNames[i]).toString();
						if (propNames[i].equalsIgnoreCase("CUST_NAME")) {
							paramValue = paramValue.toUpperCase();
						}
						if (CmConstants.MatchType.BOTH_MATCH == Integer.parseInt(param.get("MATCH_TYPE").toString())) {
							condition.append(" AND ").append(propNames[i]).append(" LIKE :").append(propNames[i]);
							paramInfo.getParameter().put(propNames[i], "%" + paramValue + "%");
						} else {
							condition.append(" AND ").append(propNames[i]).append(" LIKE :").append(propNames[i]);
							paramInfo.getParameter().put(propNames[i], paramValue + "%");
						}
					} else if (propNames[i].equals("CUST_STATUS")) {
						// 针对cust_status做特殊处理(前台有可能传入多个cust_status)
						String paramValue = param.get(propNames[i]).toString();
						String[] status = paramValue.split(",");
						condition.append(" AND ").append(propNames[i]).append(" IN ( ");
						for (int j = 0; j < status.length; j++) {
							condition.append(status[j]);
							if (j < status.length - 1) {
								condition.append(" , ");
							}
						}
						condition.append(" ) ");
					} else {
						condition.append(" AND ").append(propNames[i]).append(" = :").append(propNames[i]);
						paramInfo.getParameter().put(propNames[i], param.get(propNames[i]));
					}

				}
			}
		} else {
			Iterator it = param.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				// 跳过为空的条件
				if (StringUtils.isBlank(String.valueOf(entry.getValue()))) {
					continue;
				}
				// 跳过数字类型的值为-1的条件
				if ("-1".equalsIgnoreCase(String.valueOf(entry.getValue()))) {
					continue;
				}
				// 如果属性在like查询条件中，则拼接为like条件
				if (likeProperties.containsKey(entry.getKey())) {
					condition.append(" AND ").append(entry.getKey()).append(" LIKE :").append(entry.getKey());
					paramInfo.getParameter().put(entry.getKey(), entry.getValue() + "%");
				} else {
					condition.append(" AND ").append(entry.getKey()).append(" = :").append(entry.getKey());
					paramInfo.getParameter().put(entry.getKey(), entry.getValue());
				}
			}
		}
		paramInfo.setCondition(condition.append(" ").toString());
		// 如果查询条件中包含了业务编码，则将业务编码塞到Parameter对象中，便于记录业务日志。
		if (param.containsKey(ICmBusiLogValue.S_BusinessId) && CmCommonUtil.isEmptyObj(param.get(ICmBusiLogValue.S_BusinessId))) {
			paramInfo.setBusinessId(DataType.getAsLong(param.get(ICmBusiLogValue.S_BusinessId)));
		}
		return paramInfo;

	}

	/**   
	 * @Function parseXmlCriteria
	 * @Description 将前台传入的报文解析问DataContainer对象数组。
	 *
	 * @param criteria 前台 前台传入的XML报文字符串。<br>
	 * 格式为：<br>
	 * <pre>
	 *  &lt; ?xml version="1.0" encoding="gb2312"?&gt;
	 *  &lt;Parameters&gt;
	 * 		&lt;com.asiainfo.crm.cm.common.bo.CustomerBean&gt;
	 * 			&lt;CUST_NAME&gt;custName&lt;/CUST_NAME&gt;
	 * 			......
	 * 			&lt;CUST_ID&gt;custName&lt;/CUST_ID&gt;
	 * 		&lt;/com.asiainfo.crm.cm.common.bo.CustomerBean&gt;
	 *  &lt;/Parameters&gt;
	 *  </pre>
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-21 下午2:35:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-21     huzq2           v1.0.0               修改原因
	 */
	public static DataContainer[] parseXmlCriteria(String criteria) throws Exception {
		criteria = URLDecoder.decode(URLDecoder.decode(criteria, "UTF-8"), "UTF-8");
		IBOBsStaticDataValue[] staticDataValues = StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.CM_ENCODE_FIELDS);
		if (staticDataValues != null && staticDataValues.length > 0) {
			int startIndex = -1;
			int endIndex = -1;
			String temp = null;
			StringBuffer sb = null;
			for (int i = 0; i < staticDataValues.length; i++) {
				startIndex = criteria.indexOf("<" + staticDataValues[i].getCodeName() + ">");
				endIndex = criteria.indexOf("</" + staticDataValues[i].getCodeName() + ">");
				if (startIndex > 0 && endIndex > 0) {
					temp = criteria.substring(startIndex + Integer.parseInt(staticDataValues[i].getExternCodeType()), endIndex);
					sb = new StringBuffer();
					sb.append(criteria.substring(0, startIndex + Integer.parseInt(staticDataValues[i].getExternCodeType()))).append(URLEncoder.encode(temp, "UTF-8"))
							.append(criteria.substring(endIndex, criteria.length()));
					criteria = sb.toString();
				}
			}
		}
		Element params = XmlUtil.parseXmlOfString(criteria);
		List list = new ArrayList();
		for (Iterator i = params.elementIterator(); i.hasNext();) {
			Element crition = (Element) i.next();
			Class beanClazz = Class.forName(StringUtils.trim(crition.getName()));
			if (!ClassUtils.isAssignable(beanClazz, DataContainer.class)) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000073"));
				}
				ExceptionUtil.throwBusinessException("CMS0000073");
			}
			DataContainer dc = (DataContainer) DataContainerFactory.createDataContainerInstance(beanClazz, null);
			for (Iterator j = crition.elementIterator(); j.hasNext();) {
				Element node = (Element) j.next();
				// 如果节点的文本信息为空，则直接跳过
				if (StringUtils.isBlank(node.getText())) {
					continue;
				}
				// 判断dc是不是一个具体的BOBean类型，如果是则以BOBean对应字段的类型为这个属性的值的数据类型，否则默认为String类型
				if (dc.getType() instanceof ObjectTypeNull) {
					dc.initProperty(StringUtils.trim(node.getName()), node.getText());
				} else {
					dc.initProperty(StringUtils.trim(node.getName()), DataType.transfer(node.getText(), dc.getPropertyType(StringUtils.trim(node.getName()))));
				}
			}
			list.add(dc);
		}
		DataContainer[] result = (DataContainer[]) list.toArray(new DataContainer[0]);
		if (staticDataValues != null && staticDataValues.length > 0) {
			for (int i = 0; i < staticDataValues.length; i++) {
				if (result[0].hasProperty(staticDataValues[i].getCodeName())) {
					String encodeName = result[0].getAsString(staticDataValues[i].getCodeName());
					encodeName = URLDecoder.decode(encodeName, "UTF-8");
					result[0].set(staticDataValues[i].getCodeName(), encodeName);
				}
			}
		}
		return result;
	}

	public static DataContainer[] parseXmlCriteria_new(String criteria) throws Exception {
		Element params = XmlUtil.parseXmlOfString(criteria);
		List list = new ArrayList();
		for (Iterator i = params.elementIterator(); i.hasNext();) {
			Element crition = (Element) i.next();
			Class beanClazz = Class.forName(StringUtils.trim(crition.getName()));
			if (!ClassUtils.isAssignable(beanClazz, DataContainer.class)) {
				if (log.isErrorEnabled()) {
					log.error(CrmLocaleFactory.getResource("CMS0000073"));
				}
				ExceptionUtil.throwBusinessException("CMS0000073");
			}
			DataContainer dc = (DataContainer) DataContainerFactory.createDataContainerInstance(beanClazz, null);
			for (Iterator j = crition.elementIterator(); j.hasNext();) {
				Element node = (Element) j.next();
				// 如果节点的文本信息为空，则直接跳过
				if (StringUtils.isBlank(node.getText())) {
					continue;
				}
				// 判断dc是不是一个具体的BOBean类型，如果是则以BOBean对应字段的类型为这个属性的值的数据类型，否则默认为String类型
				if (dc.getType() instanceof ObjectTypeNull) {
					dc.initProperty(StringUtils.trim(node.getName()), node.getText());
				} else {
					if (dc.getType().hasProperty(StringUtils.trim(node.getName())))
						dc.initProperty(StringUtils.trim(node.getName()), DataType.transfer(node.getText(), dc.getPropertyType(StringUtils.trim(node.getName()))));
					else
						dc.initProperty(StringUtils.trim(node.getName()), node.getText());
				}
			}
			list.add(dc);
		}
		return (DataContainer[]) list.toArray(new DataContainer[0]);
	}

	/**
	 * 构造in查询条件
	 * @param condition
	 * @param propName
	 * @return Parameter
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-17
	 */
	public static Parameter buildInParameter(long condition[], String propName) throws Exception {
		Parameter paramInfo = new Parameter();
		Map parameter = new HashMap();
		StringBuffer conditionStr = new StringBuffer();
		conditionStr.append(" 1=1 ").append(" AND ").append(propName).append(" IN (");
		propName = propName.trim();
		int i = 0;
		for (i = 0; i < condition.length - 1; i++) {
			conditionStr.append(" :").append(propName).append(i).append(" , ");
			parameter.put(propName + i, condition[i]);
		}
		conditionStr.append(" :").append(propName).append(i).append(" ) "); // 后括号前需要加一个空格，否则在平台处理绑定变量是无法识别。--huzq2
		parameter.put(propName + i, condition[i]);
		paramInfo.setCondition(conditionStr.toString());
		paramInfo.setParameter(parameter);
		return paramInfo;
	}

	public static Parameter buildInParameter(String condition[], String propName) throws Exception {
		Parameter paramInfo = new Parameter();
		Map parameter = new HashMap();
		StringBuffer conditionStr = new StringBuffer();
		conditionStr.append(" 1=1 ").append(" AND ").append(propName).append(" IN (");
		propName = propName.trim();
		int i = 0;
		for (i = 0; i < condition.length - 1; i++) {
			conditionStr.append(" :").append(propName).append(i).append(" , ");
			parameter.put(propName + i, "'" + condition[i] + "'");
		}
		conditionStr.append(" :").append(propName).append(i).append(" ) "); // 后括号前需要加一个空格，否则在平台处理绑定变量是无法识别。--huzq2
		parameter.put(propName + i, "'" + condition[i] + "'");
		paramInfo.setCondition(conditionStr.toString());
		paramInfo.setParameter(parameter);
		return paramInfo;
	}

	/**   
	 * 将DataContainer数组转换为Map
	 * @Function transferDataContainersToMap
	 * @Description 
	 *
	 * @param dcs
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-30 上午10:59:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-30     huzq2           v1.0.0               修改原因<br>
	 */
	public static Map transferDataContainersToMap(DataContainer[] dcs) throws Exception {
		Map prop = new HashMap();
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			for (int i = 0; i < dcs.length; i++) {
				if (CmCommonUtil.isNotEmptyObject(dcs[i])) {
					prop.putAll(dcs[i].getProperties());
				}
			}
		}
		return prop;
	}

	/**   
	 * 验证查询条件是否存在无效查询条件等
	 * @Function validateParameter
	 * @Description 
	 *
	 * @param parameter
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-6-5 上午12:06:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-5     huzq2           v1.0.0               修改原因<br>
	 */
	public static void validateParameter(Parameter parameter) throws Exception {
		// 增加对没有任何条件查询的拦截，避免因为查询数据量大导致系统故障
		if (StringUtils.isBlank(parameter.getCondition()) || StringUtils.isBlank(parameter.getCondition().replaceAll(CmConstants.MatchType.NO_CONDITION, ""))) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0010034")); // 输入参数不合法！
			}
			ExceptionUtil.throwBusinessException("CMS0010034"); // 输入参数不合法！
		}
	}
}
