package com.asiainfo.crm.cm.common.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICustMgntFSV;

public class JexlCalculate {

	private JexlEngine jexlEngine = new JexlEngine(); // 计算引擎

	/**
	 * 根据计算表达式,获取计算结果
	 * 
	 * @param expression
	 * @param paraMap
	 * @return
	 * @throws Exception
	 */
	public String evaluateExpression(String expression, Map<String, Object> paraMap) throws Exception {
		if (StringUtils.isBlank(expression)) {
			throw new Exception("expression is can not null ");
		}
		Expression expr = jexlEngine.createExpression(expression);
		JexlContext jexlContext = new MapContext(paraMap);
		Object result = expr.evaluate(jexlContext);
		if (result != null) {
			return String.valueOf(result);
		}

		return null;
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Map map = new HashMap();
		map.put("TENANT_ID", "02");
		map.put("JexlCalculate", JexlCalculate.class);
		ICustMgntFSV custMgntFSV = (ICustMgntFSV)ServiceFactory.getService(ICustMgntFSV.class);
		map.put("custMgntFSV", custMgntFSV);
		map.put("map", new HashMap());
		String expression = "if(TENANT_ID=='01'){custMgntFSV.accNetWork(map)}else{}";
		JexlCalculate jexl = new JexlCalculate();
		jexl.evaluateExpression(expression, map);
	}

	public static void updatePsState(String state) throws Exception {
		//
	}
}
