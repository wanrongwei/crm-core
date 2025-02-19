package com.asiainfo.crm.cm.common;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgObjectWrapperValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCfgSpecListTypeValue;
import com.asiainfo.crm.cm.common.util.CmCfgObjectWrapperUtil;
import com.asiainfo.crm.cm.common.util.CmCfgSpecListTypeUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;

public class CmObjectWrapperFactory {

	private static transient Log log = LogFactory.getLog(CmObjectWrapperFactory.class);

	/**
	 * 对象类型为AppFrame中的DataContainer
	 */
	public static final int OBJ_TYPE_DATA_CONTAINER = 1;
	/**
	 * 普通的JavaBean
	 */
	public static final int OBJ_TYPE_JAVA_BEAN = 2;

	/**
	 * 参数中的占位符
	 */
	public static final String PARAM_REPLACE_CHAR = "$ATTR_VALUE$";

	public static final String PARAM_REPLACE_CHAR_TMPL = "${0}$";

	public static DataStructInterface wrap(DataStructInterface object) throws Exception {
		// 增加对数据容器为空的拦截
		if (CmCommonUtil.isEmptyObject(object)) {
			return object;
		}
		// 跳过普通的DataContainer对象
		if (object.getObjectType() instanceof ObjectTypeNull) {
			return object;
		}
		long start = System.currentTimeMillis();
		String objectName = object.getClass().getName();
		IBOCmCfgObjectWrapperValue[] wrapperValues = CmCfgObjectWrapperUtil.getCfgObjectWrappers(objectName, CmConstants.WrapperType.LIST_DATA_SOURCE);
		if (CmCommonUtil.isNotEmptyObject(wrapperValues)) {
			for (int i = 0; i < wrapperValues.length; i++) {
				IBOCmCfgObjectWrapperValue wrapperValue = wrapperValues[i];
				String attrName = wrapperValue.getAttrName();
				// 如果属性名称为空则不处理
				if (attrName == null) {
					continue;
				}
				Object attrValue = object.get(attrName);
				String dispAttrName = wrapperValue.getDispAttrName();
				String dispAttrService = wrapperValue.getDispAttrService();
				String dispAttrValueName = wrapperValue.getDispAttrValue();
				String dispAttrGetter = wrapperValue.getDispAttrGetter();
				// 如果属性值、显示属性名称、显示属性获取服务、显示属性值属性名称或显示属性获取方法为空则不处理
				if (StringUtils.isBlank(DataType.getAsString(attrValue)) || StringUtils.isBlank(dispAttrName) || StringUtils.isBlank(dispAttrService)
						|| StringUtils.isBlank(dispAttrValueName) || StringUtils.isBlank(dispAttrGetter)) {
					// 参数错误，参数{0}不能为空！
					if (log.isErrorEnabled()) {
						log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
					}
					continue;
				}
				String dispAttrParamDatatype = wrapperValue.getDispAttrParamDatatype();
				String dispAttrParam = wrapperValue.getDispAttrParam();
				// 将参数中的占位符替换成实际的值
				if (StringUtils.isNotBlank(dispAttrParam)) {
					dispAttrParam = dispAttrParam.replace(PARAM_REPLACE_CHAR, attrValue.toString());
					// 替换其中的表达式
					String exp = null;
					exp = StringUtils.substringBetween(dispAttrParam, "$", "$");
					while (StringUtils.isNotBlank(exp)) {
						// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
						String tmpExp = exp;
						if (tmpExp.endsWith("=")) {
							tmpExp = tmpExp + " =";
						}
						if (StringUtils.isNotBlank(tmpExp)) {
							String[] tempstrs = tmpExp.split("=");
							if (tempstrs.length != 2) {
								dispAttrParam = dispAttrParam.replaceFirst(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), " ");
							} else {
								if ("ATTR_CODE".equalsIgnoreCase(StringUtils.trim(tempstrs[0]))) {
									Object attrObject = object.get(StringUtils.upperCase(StringUtils.trim(tempstrs[1])));
									dispAttrParam = dispAttrParam.replace(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), DataType.getAsString(attrObject));
								} else {
									dispAttrParam = dispAttrParam.replaceFirst(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), " ");
								}
							}
						} else {
							dispAttrParam = dispAttrParam.replaceFirst(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), " ");
						}
					}
					// 特殊处理.如果是多个分隔符号相连，必须处理成多个分隔符号中间用空格隔开
					// 否则造成字符串分割的数组长度不对
					for (int j = 0; j < 2; j++) {
						if (dispAttrParam.indexOf(",,") != -1) {
							dispAttrParam = StringUtils.replace(dispAttrParam, ",,", ", ,");
						}
					}
					// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
					if (dispAttrParam.endsWith(",")) {
						dispAttrParam = dispAttrParam + " ,";
					}
				}
				// 特殊处理.如果是多个分隔符号相连，必须处理成多个分隔符号中间用空格隔开
				if (StringUtils.isNotBlank(dispAttrParamDatatype)) {
					// 否则造成字符串分割的数组长度不对
					for (int j = 0; j < 2; j++) {
						if (dispAttrParamDatatype.indexOf(",,") != -1) {
							dispAttrParamDatatype = StringUtils.replace(dispAttrParamDatatype, ",,", ", ,");
						}
					}
					// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
					if (dispAttrParamDatatype.endsWith(",")) {
						dispAttrParamDatatype = dispAttrParamDatatype + " ,";
					}
				}
				// 如果配置的是静态数据
				if ("static".equals(dispAttrService) || StaticDataUtil.class.getClass().getName().equals(dispAttrService)) {
					String[] params = dispAttrParam.split(",");
					// 静态数据必须有两个参数，否则跳过
					if (params.length != 2) {
						// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0031148"));
						}
						continue;
					}
					if (StringUtils.isBlank(params[0])) {
						// 参数错误，参数{0}不能为空！
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
						}
						continue;
					}
					IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(StringUtils.trim(params[0]), StringUtils.trim(params[1]));
					if (CmCommonUtil.isNotEmptyObject(staticDataValue)) {
						object.initProperty(StringUtils.trim(dispAttrName), staticDataValue.getCodeName());
					}
				} // 行政区域
				else if ("district".equals(dispAttrService) || BsCommonDistrictUtil.class.getClass().getName().equals(dispAttrService)) {
					String[] params = dispAttrParam.split(",");
					// 静态数据必须有两个参数，否则跳过
					if (params.length != 1) {
						// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0031148"));
						}
						continue;
					}
					if (!StringUtils.isNumeric(params[0])) {
						// 参数错误，参数{0}不能为空！
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
						}
						continue;
					}
					IBOBsCommonDistrictValue districtValue = BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(params[0]));
					if (CmCommonUtil.isNotEmptyObject(districtValue)) {
						object.initProperty(StringUtils.trim(dispAttrName), districtValue.getDistrictName());
					}
				} // 特殊名单类型
				else if ("specialListType".equals(dispAttrService) || CmCfgSpecListTypeUtil.class.getClass().getName().equals(dispAttrService)) {
					String[] params = dispAttrParam.split(",");
					// 静态数据必须有两个参数，否则跳过
					if (params.length != 1) {
						// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0031148"));
						}
						continue;
					}
					if (!StringUtils.isNumeric(params[0])) {
						// 参数错误，参数{0}不能为空！
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
						}
						continue;
					}
					IBOCmCfgSpecListTypeValue typeValue = CmCfgSpecListTypeUtil.getCfgSpecListType(DataType.getAsInt(params[0]));
					if (CmCommonUtil.isNotEmptyObject(typeValue)) {
						object.initProperty(StringUtils.trim(dispAttrName), typeValue.getTypeName());
					}
				} else {
					String[] paramDatatypes = dispAttrParamDatatype.split(",");
					String[] params = dispAttrParam.split(",");
					if (paramDatatypes.length != params.length) {
						// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0031148"));
						}
						continue;
					}
					Class[] paramTypes = new Class[paramDatatypes.length];
					Object[] paramObjects = new Object[params.length];
					for (int j = 0; j < paramDatatypes.length; j++) {
						String className = paramDatatypes[j];
						if (StringUtils.isBlank(className)) {
							// 参数类型为空则跳出循环并执行外循环下一次循环
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0031149"));
							}
							break;
						}
						paramTypes[j] = DataType.getJavaClass(className);
						paramObjects[j] = DataType.transfer(StringUtils.trim(params[j]), paramTypes[j]);
					}
					// 是否标准服务
					boolean isSV = false;
					if (StringUtils.lastIndexOf(dispAttrService, "SV") != -1) {
						isSV = true;
					}
					try {
						Object serviceObject = null;
						if (isSV) {
							serviceObject = ServiceFactory.getService(StringUtils.trim(dispAttrService));
						} else {
							serviceObject = ServiceFactory.getSeviceOfLocal(StringUtils.trim(dispAttrService));
						}
						if (serviceObject == null) {
							continue;
						}
						Method serviceMethod = serviceObject.getClass().getMethod(StringUtils.trim(dispAttrGetter), paramTypes);
						Object attrObject = serviceMethod.invoke(serviceObject, paramObjects);
						if (attrObject == null || (attrObject.getClass().isArray() && Array.getLength(attrObject) <= 0)) {
							// 参数类型为空则跳出循环并执行外循环下一次循环
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0031149"));
							}
							continue;
						}
						// 如果是DataStructInterface子类,则直接调用get方法
						if (attrObject instanceof DataStructInterface) {
							object.initProperty(StringUtils.trim(dispAttrName), ((DataStructInterface) attrObject).get(StringUtils.trim(dispAttrValueName)));
						} else if (attrObject instanceof DataStructInterface[]) {
							DataStructInterface[] dcs = (DataStructInterface[]) attrObject;
							boolean isFound = false;
							for (int j = 0; j < dcs.length; j++) {
								DataStructInterface dc = dcs[j];
								if (dc instanceof IBOBsStaticDataValue && StringUtils.equals(((IBOBsStaticDataValue) dc).getCodeType(), DataType.getAsString(attrValue))) {
									object.initProperty(StringUtils.trim(dispAttrName), dc.get(StringUtils.trim(dispAttrValueName)));
									isFound = true;
									break;
								} else if (dc instanceof IBOBsCommonDistrictValue && ((IBOBsCommonDistrictValue) dc).getDistrictId() == DataType.getAsLong(attrValue)) {
									object.initProperty(StringUtils.trim(dispAttrName), dc.get(StringUtils.trim(dispAttrValueName)));
									isFound = true;
									break;
								}
							}
							if (!isFound) {
								object.initProperty(StringUtils.trim(dispAttrName), dcs[0].get(StringUtils.trim(dispAttrValueName)));
							}
						} else {
							String dispAttrValueGetter = wrapperValue.getDispAttrValueGetter();
							// 如果没有配置则跳过
							if (StringUtils.isBlank(dispAttrValueGetter)) {
								// 参数类型为空则跳出循环并执行外循环下一次循环
								if (log.isErrorEnabled()) {
									log.error(CrmLocaleFactory.getResource("CMS0031149"));
								}
								continue;
							}
							Method attrGetMethod = attrObject.getClass().getMethod(StringUtils.trim(dispAttrValueGetter), new Class[0]);
							Object attrValueObject = attrGetMethod.invoke(attrObject, new Object[0]);
							if (attrValueObject != null) {
								object.initProperty(StringUtils.trim(dispAttrName), attrValueObject);
							}
						}
					} catch (Exception e) {
						if (log.isErrorEnabled()) {
							log.error(e.getMessage(), e);
						}
					}
				}
			}
		}
		if (log.isDebugEnabled()) {
			log.debug("Excute CmObjectWrapperFactory.wrap(DataStructInterface) cost: " + (System.currentTimeMillis() - start) + " MS.");
		}
		return object;
	}

	public static DataStructInterface[] wrap(DataStructInterface[] objects) throws Exception {
		if (CmCommonUtil.isEmptyObject(objects)) {
			return objects;
		}
		String objectName = null;
		IBOCmCfgObjectWrapperValue[] wrapperValues = null;
		long start = System.currentTimeMillis();
		for (int k = 0; k < objects.length; k++) {
			DataStructInterface object = objects[k];
			// 跳过普通的DataContainer对象
			if (object.getObjectType() instanceof ObjectTypeNull) {
				continue;
			}
			// 对于一个数组而言只处理同一个类型的数据，只需要在第一次循环时初始化一下即可。
			if (k == 0) {
				objectName = object.getClass().getName();
				wrapperValues = CmCfgObjectWrapperUtil.getCfgObjectWrappers(objectName, CmConstants.WrapperType.LIST_DATA_SOURCE);
				if (CmCommonUtil.isEmptyObject(wrapperValues)) {
					break;
				}
			}
			if (wrapperValues != null) {
				for (int i = 0; i < wrapperValues.length; i++) {
					IBOCmCfgObjectWrapperValue wrapperValue = wrapperValues[i];
					String attrName = wrapperValue.getAttrName();
					// 如果属性名称为空则不处理
					if (attrName == null) {
						continue;
					}
					Object attrValue = object.get(attrName);
					String dispAttrName = wrapperValue.getDispAttrName();
					String dispAttrService = wrapperValue.getDispAttrService();
					String dispAttrValueName = wrapperValue.getDispAttrValue();
					String dispAttrGetter = wrapperValue.getDispAttrGetter();
					// 如果属性值、显示属性名称、显示属性获取服务、显示属性值属性名称或显示属性获取方法为空则不处理
					if (StringUtils.isBlank(DataType.getAsString(attrValue)) || StringUtils.isBlank(dispAttrName) || StringUtils.isBlank(dispAttrService)
							|| StringUtils.isBlank(dispAttrValueName) || StringUtils.isBlank(dispAttrGetter)) {
						// 参数错误，参数{0}不能为空！
						if (log.isErrorEnabled()) {
							log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
						}
						continue;
					}
					String dispAttrParamDatatype = wrapperValue.getDispAttrParamDatatype();
					String dispAttrParam = wrapperValue.getDispAttrParam();
					// 将参数中的占位符替换成实际的值
					if (StringUtils.isNotBlank(dispAttrParam)) {
						dispAttrParam = dispAttrParam.replace(PARAM_REPLACE_CHAR, attrValue.toString());
						// 替换其中的表达式
						String exp = null;
						exp = StringUtils.substringBetween(dispAttrParam, "$", "$");
						while (StringUtils.isNotBlank(exp)) {
							// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
							String tmpExp = exp;
							if (tmpExp.endsWith("=")) {
								tmpExp = tmpExp + " =";
							}
							if (StringUtils.isNotBlank(tmpExp)) {
								String[] tempstrs = tmpExp.split("=");
								if (tempstrs.length != 2) {
									dispAttrParam = dispAttrParam.replaceFirst(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), " ");
								} else {
									if ("ATTR_CODE".equalsIgnoreCase(StringUtils.trim(tempstrs[0]))) {
										Object attrObject = object.get(StringUtils.upperCase(StringUtils.trim(tempstrs[1])));
										dispAttrParam = dispAttrParam.replace(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), DataType.getAsString(attrObject));
									} else {
										dispAttrParam = dispAttrParam.replaceFirst(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), " ");
									}
								}
							} else {
								dispAttrParam = dispAttrParam.replaceFirst(PARAM_REPLACE_CHAR_TMPL.replace("{0}", exp), " ");
							}
						}
						// 特殊处理.如果是多个分隔符号相连，必须处理成多个分隔符号中间用空格隔开
						// 否则造成字符串分割的数组长度不对
						for (int j = 0; j < 2; j++) {
							if (dispAttrParam.indexOf(",,") != -1) {
								dispAttrParam = StringUtils.replace(dispAttrParam, ",,", ", ,");
							}
						}
						// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
						if (dispAttrParam.endsWith(",")) {
							dispAttrParam = dispAttrParam + " ,";
						}
					}
					// 特殊处理.如果是多个分隔符号相连，必须处理成多个分隔符号中间用空格隔开
					if (StringUtils.isNotBlank(dispAttrParamDatatype)) {
						// 否则造成字符串分割的数组长度不对
						for (int j = 0; j < 2; j++) {
							if (dispAttrParamDatatype.indexOf(",,") != -1) {
								dispAttrParamDatatype = StringUtils.replace(dispAttrParamDatatype, ",,", ", ,");
							}
						}
						// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
						if (dispAttrParamDatatype.endsWith(",")) {
							dispAttrParamDatatype = dispAttrParamDatatype + " ,";
						}
					}
					// 如果配置的是静态数据
					if ("static".equals(dispAttrService) || StaticDataUtil.class.getClass().getName().equals(dispAttrService)) {
						String[] params = dispAttrParam.split(",");
						// 静态数据必须有两个参数，否则跳过
						if (params.length != 2) {
							// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0031148"));
							}
							continue;
						}
						if (StringUtils.isBlank(params[0])) {
							// 参数错误，参数{0}不能为空！
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
							}
							continue;
						}
						IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(StringUtils.trim(params[0]), StringUtils.trim(params[1]));
						if (CmCommonUtil.isNotEmptyObject(staticDataValue)) {
							object.initProperty(StringUtils.trim(dispAttrName), staticDataValue.getCodeName());
						}
					} // 行政区域
					else if ("district".equals(dispAttrService) || BsCommonDistrictUtil.class.getClass().getName().equals(dispAttrService)) {
						String[] params = dispAttrParam.split(",");
						// 静态数据必须有两个参数，否则跳过
						if (params.length != 1) {
							// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0031148"));
							}
							continue;
						}
						if (!StringUtils.isNumeric(params[0])) {
							// 参数错误，参数{0}不能为空！
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
							}
							continue;
						}
						IBOBsCommonDistrictValue districtValue = BsCommonDistrictUtil.getCommonDistrictById(DataType.getAsLong(params[0]));
						if (CmCommonUtil.isNotEmptyObject(districtValue)) {
							object.initProperty(StringUtils.trim(dispAttrName), districtValue.getDistrictName());
						}
					} // 特殊名单类型
					else if ("specialListType".equals(dispAttrService) || CmCfgSpecListTypeUtil.class.getClass().getName().equals(dispAttrService)) {
						String[] params = dispAttrParam.split(",");
						// 静态数据必须有两个参数，否则跳过
						if (params.length != 1) {
							// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0031148"));
							}
							continue;
						}
						if (!StringUtils.isNumeric(params[0])) {
							// 参数错误，参数{0}不能为空！
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0022001", ""));
							}
							continue;
						}
						IBOCmCfgSpecListTypeValue typeValue = CmCfgSpecListTypeUtil.getCfgSpecListType(DataType.getAsInt(params[0]));
						if (CmCommonUtil.isNotEmptyObject(typeValue)) {
							object.initProperty(StringUtils.trim(dispAttrName), typeValue.getTypeName());
						}
					} else {
						String[] paramDatatypes = dispAttrParamDatatype.split(",");
						String[] params = dispAttrParam.split(",");
						if (paramDatatypes.length != params.length) {
							// 系统参数配置错误：参数类型数量与参数值数量不一致！【不处理】
							if (log.isErrorEnabled()) {
								log.error(CrmLocaleFactory.getResource("CMS0031148"));
							}
							continue;
						}
						Class[] paramTypes = new Class[paramDatatypes.length];
						Object[] paramObjects = new Object[params.length];
						for (int j = 0; j < paramDatatypes.length; j++) {
							String className = paramDatatypes[j];
							if (StringUtils.isBlank(className)) {
								// 参数类型为空则跳出循环并执行外循环下一次循环
								if (log.isErrorEnabled()) {
									log.error(CrmLocaleFactory.getResource("CMS0031149"));
								}
								break;
							}
							paramTypes[j] = DataType.getJavaClass(className);
							paramObjects[j] = DataType.transfer(StringUtils.trim(params[j]), paramTypes[j]);
						}
						// 是否标准服务
						boolean isSV = false;
						if (StringUtils.lastIndexOf(dispAttrService, "SV") != -1) {
							isSV = true;
						}
						try {
							Object serviceObject = null;
							if (isSV) {
								serviceObject = ServiceFactory.getService(StringUtils.trim(dispAttrService));
							} else {
								serviceObject = ServiceFactory.getSeviceOfLocal(StringUtils.trim(dispAttrService));
							}
							if (serviceObject == null) {
								continue;
							}
							Method serviceMethod = serviceObject.getClass().getMethod(StringUtils.trim(dispAttrGetter), paramTypes);
							Object attrObject = serviceMethod.invoke(serviceObject, paramObjects);
							if (attrObject == null || (attrObject.getClass().isArray() && Array.getLength(attrObject) <= 0)) {
								// 参数类型为空则跳出循环并执行外循环下一次循环
								if (log.isErrorEnabled()) {
									log.error(CrmLocaleFactory.getResource("CMS0031149"));
								}
								continue;
							}
							// 如果是DataStructInterface子类,则直接调用get方法
							if (attrObject instanceof DataStructInterface) {
								object.initProperty(StringUtils.trim(dispAttrName), ((DataStructInterface) attrObject).get(StringUtils.trim(dispAttrValueName)));
							} else if (attrObject instanceof DataStructInterface[]) {
								DataStructInterface[] dcs = (DataStructInterface[]) attrObject;
								boolean isFound = false;
								for (int j = 0; j < dcs.length; j++) {
									DataStructInterface dc = dcs[j];
									if (dc instanceof IBOBsStaticDataValue && StringUtils.equals(((IBOBsStaticDataValue) dc).getCodeType(), DataType.getAsString(attrValue))) {
										object.initProperty(StringUtils.trim(dispAttrName), dc.get(StringUtils.trim(dispAttrValueName)));
										isFound = true;
										break;
									} else if (dc instanceof IBOBsCommonDistrictValue && ((IBOBsCommonDistrictValue) dc).getDistrictId() == DataType.getAsLong(attrValue)) {
										object.initProperty(StringUtils.trim(dispAttrName), dc.get(StringUtils.trim(dispAttrValueName)));
										isFound = true;
										break;
									}
								}
								if (!isFound) {
									object.initProperty(StringUtils.trim(dispAttrName), dcs[0].get(StringUtils.trim(dispAttrValueName)));
								}
							} else {
								String dispAttrValueGetter = wrapperValue.getDispAttrValueGetter();
								// 如果没有配置则跳过
								if (StringUtils.isBlank(dispAttrValueGetter)) {
									// 参数类型为空则跳出循环并执行外循环下一次循环
									if (log.isErrorEnabled()) {
										log.error(CrmLocaleFactory.getResource("CMS0031149"));
									}
									continue;
								}
								Method attrGetMethod = attrObject.getClass().getMethod(StringUtils.trim(dispAttrValueGetter), new Class[0]);
								Object attrValueObject = attrGetMethod.invoke(attrObject, new Object[0]);
								if (attrValueObject != null) {
									object.initProperty(StringUtils.trim(dispAttrName), attrValueObject);
								}
							}
						} catch (Exception e) {
							if (log.isErrorEnabled()) {
								log.error(e.getMessage(), e);
							}
						}
					}
				}
			}
		}
		if (log.isDebugEnabled()) {
			log.debug("Excute CmObjectWrapperFactory.wrap(DataStructInterface[]) cost: " + (System.currentTimeMillis() - start) + " MS.");
		}
		return objects;
	}
}
