package com.asiainfo.crm.cm.common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;

public class jexlFunction {

	/**
	 * 包含
	 * 
	 * @param include
	 * @param valueStr
	 * @return
	 * @throws Exception
	 */
	public static boolean in(String include, String valueStr) throws Exception {
		if (StringUtils.isBlank(include) || StringUtils.isBlank(valueStr)) {
			throw new Exception("Containing function is included attributes and comparative value can not be empty!");
		}
		Map<String, String> map = convertStrToMap(include);
		StringTokenizer st = new StringTokenizer(valueStr, ",");
		boolean isIn = false;
		String containKey = null;
		while (st.hasMoreTokens()) {
			containKey = st.nextToken();
			if (map.containsKey(containKey)) {
				isIn = true;
				break;
			}

		}

		return isIn;
	}

	/**
	 * 包含所有
	 * 
	 * @param include
	 *            被包含属性
	 * @param values
	 *            比较值
	 * @return
	 */
	public static boolean inAll(String include, String valueStr) throws Exception {
		if (StringUtils.isBlank(include) || StringUtils.isBlank(valueStr)) {
			throw new Exception("Containing function is included attributes and comparative value can not be empty!");
		}
		Map<String, String> map = convertStrToMap(include);
		StringTokenizer st = new StringTokenizer(valueStr, ",");
		String containKey = null;
		boolean isInAll = true;
		while (st.hasMoreTokens()) {
			containKey = st.nextToken();
			if (!map.containsKey(containKey)) {
				isInAll = false;
				break;
			}
		}
		return isInAll;
	}

	/**
	 * 不包含
	 * 
	 * @param include
	 * @param valueStr
	 * @return
	 * @throws Exception
	 */
	public static boolean notIn(String include, String valueStr) throws Exception {
		if (StringUtils.isBlank(include) || StringUtils.isBlank(valueStr)) {
			throw new Exception("Containing function is included attributes and comparative value can not be empty!");
		}
		Map<String, String> map = convertStrToMap(include);
		StringTokenizer st = new StringTokenizer(valueStr, ",");
		String containKey = null;
		boolean isNotIn = false;
		while (st.hasMoreTokens()) {
			containKey = st.nextToken();
			if (!map.containsKey(containKey)) {
				isNotIn = true;
				break;
			}
		}

		return isNotIn;
	}

	/**
	 * 不包含所有
	 * 
	 * @param include
	 * @param valueStr
	 * @return
	 * @throws Exception
	 */
	public static boolean notInAll(String include, String valueStr) throws Exception {
		if (StringUtils.isBlank(include) || StringUtils.isBlank(valueStr)) {
			throw new Exception("Containing function is included attributes and comparative value can not be empty!");
		}
		Map<String, String> map = convertStrToMap(include);
		StringTokenizer st = new StringTokenizer(valueStr, ",");
		String containKey = null;
		boolean isNotIn = true;
		while (st.hasMoreTokens()) {
			containKey = st.nextToken();
			if (map.containsKey(containKey)) {
				isNotIn = false;
				break;
			}
		}
		return isNotIn;
	}

	/**
	 * 字符串转换成MAP
	 * 
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> convertStrToMap(String str) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		StringTokenizer st = new StringTokenizer(str, ",");
		String val = null;
		while (st.hasMoreTokens()) {
			val = st.nextToken();
			map.put(val, val);
		}
		return map;
	}
}
