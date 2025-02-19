package com.asiainfo.crm.util;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil
{

	/**
	 * 通用为空判断方法, 支持String, 数组, 集合
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj)
	{
		if (null == obj)
			return true;
		if (obj instanceof String)
			return ((String) obj).trim().length() == 0;
		if (obj instanceof Object[])
			return ((Object[]) obj).length == 0;
		if (obj instanceof Collection)
			return ((Collection) obj).isEmpty();
		if (obj instanceof Map)
			return ((Map) obj).isEmpty();
		return false;
	}

	public static String format(String s, Object... param)
	{
		if (StringUtil.isEmpty(s) || StringUtil.isEmpty(param))
			return s;
		Pattern p = Pattern.compile("\\{(\\d+)\\}");
		Matcher m = p.matcher(s);
		StringBuffer reString = new StringBuffer();
		if (m.find())
			do
			{
				int paramIndex = Integer.parseInt(m.group(1));
				// modify by liuqs， date：2015-04-13
				Object rpaObj = param[paramIndex];
				if (null != rpaObj)
					m.appendReplacement(reString, rpaObj.toString());
			} while (m.find());
		else
			return s;
		return reString.toString();
	}
	public static String getRandomString(int i_count) {
		Random random = new Random();
		StringBuffer sBuffer = new StringBuffer();

		for(int i = 0; i < i_count; ++i) {
			sBuffer.append(String.valueOf(random.nextInt(10)));
		}

		return sBuffer.toString();
	}

}
