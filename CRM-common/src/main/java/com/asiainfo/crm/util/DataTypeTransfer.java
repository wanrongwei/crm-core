package com.asiainfo.crm.util;

import com.ai.appframe2.common.DataType;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Method;

/**   
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: DataTypeTransfer.java
 * @Description: 数据类型转换
 *	@
 * @version: v1.0.0
 * @author: zhouts
 * @date: 2012-9-21 上午09:48:35 
 */
public class DataTypeTransfer {
    private static final short defNum=-1;
    private static final String defStr=null;
    
    public static String getAsString(Object obj){
        return getAsString(obj,defStr);
    }
    public static String getAsString(Object obj,String defStr){
        if(isBlank(obj)){
            return defStr;
        }
        return String.valueOf(obj);
    }
    public static int getAsInt(Object obj){
        return getAsInt(obj,defNum);
    }
    public static int getAsInt(Object obj , int defInt){
        if(isBlank(obj)){
            return defInt;
        }else {
            return Integer.parseInt(String.valueOf(obj));
        }
    }
    
    public static long getAsLong(Object obj){
        return getAsLong(obj,defNum);
    }
    public static long getAsLong(Object obj,long defLong){
        if(isBlank(obj)){
            return defLong;
        }else {
            return Long.parseLong(String.valueOf(obj));
        }
    }
    
	/**
	 * 
	 * @param obj 需要转换的数值
	 * @param clazz 需要转换的类型(输入类型为Number时候，返回值一律为0)
	 * @return  
	 * @version: v1.0.0   
	 * @author: zhouts
	 * @throws Exception 
	 * @date: 2012-9-21 上午10:00:40
	 */
	public static Object getValueByClass(Object obj , Class clazz) throws Exception{
		String methodName=DataType.getTransFunc(clazz.getSimpleName());
		return getValue(obj,methodName);
	}
	public static Object getValueByString(Object obj , String name) throws Exception{
		String methodName=DataType.getTransFunc(name);
		return getValue(obj,methodName);
	}
    public static boolean isBlank(Object obj){
        if(obj==null){
            return true;
        }
        String str=obj.toString();
        int strLen;
        if (str == null || (strLen = str.length()) == 0)
            return true;
        for (int i = 0; i < strLen; i++){
            if (!Character.isWhitespace(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
	private static Object getValue(Object obj, String methodName)  throws Exception{
		if(obj==null||StringUtils.isBlank(obj.toString())){
			obj=null;
		}	
		Method method =DataType.class.getMethod(methodName, Object.class);
		Object retObj=method.invoke(null, obj);
		return retObj;
	}
}
