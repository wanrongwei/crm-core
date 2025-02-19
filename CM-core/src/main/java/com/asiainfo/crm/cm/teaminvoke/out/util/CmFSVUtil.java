/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.out.util;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.model.bo.PartyBean;
import com.asiainfo.crm.cm.teaminvoke.out.busimodel.IConvertBusiModel;
import org.apache.commons.lang.StringUtils;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-1-5 下午5:36:34
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-1-5     Xiaohu           v1.0.0               修改原因<br>
 */
public class CmFSVUtil {
	

	/**   
	 * @Function getConvertBusiModel
	 * @Description 获取接口参数转换的实现具体实现类
	 *
	 * @param abstractImplClass
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-1-6 下午3:21:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-6     Xiaohu           v1.0.0               修改原因<br>
	 */
	public static final IConvertBusiModel getConvertBusiModel(Class abstractImplClass) throws Exception{
		return (IConvertBusiModel) CmServiceFactory.getBusiMode(abstractImplClass);
	}
	
	/**
	 * 利用反射机制，将Map转换为Object
	 * @param mapInfo
	 * @return
	 * @throws Exception
	 * @return: DataContainer
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-3-26 下午06:38:36
	 */
	public static Object map2Object(Class<?> clazz,Map<?,?> mapInfo)throws Exception
	{
		if(clazz==null||mapInfo.isEmpty())
			return null;
		
		
		Object o=Class.forName(clazz.getName()).newInstance();
		Method[] mthds=clazz.getDeclaredMethods();
		Map<String,Method> keyMethod=new HashMap<String,Method>();
		for(int i=0;i<mthds.length;i++)
		{
			String methodName=mthds[i].getName().toString();
			if(methodName.startsWith("set"))
				keyMethod.put(methodName.substring(3).toUpperCase(), mthds[i]);
		}
		
		for (Iterator<?> iterator = mapInfo.entrySet().iterator(); iterator.hasNext();) 
		{
			Map.Entry info = (Map.Entry) iterator.next();
			String key=info.getKey().toString().toUpperCase();
			Object value=info.getValue();			
			if(value!=null&& StringUtils.isNotBlank(value.toString()))
			{
				if(keyMethod.containsKey(key))
				{
					Method mt = (Method)keyMethod.get(key) ;
					Class<?>[] parameterClazzs = mt.getParameterTypes() ;
					
					value=DataType.transfer(value, parameterClazzs[0]);
					
					/*if(long.class.equals(tp[0]))
						value = Long.parseLong(value.toString());
					else if(int.class.equals(tp[0]))
						value = Integer.parseInt(value.toString());
					else if(boolean.class.equals(tp[0]))
						value = Boolean.parseBoolean(value.toString());
					else if(Timestamp.class.equals(tp[0]))
					{
						String timeStr=value.toString();
						value=TimeUtil.getTimstampByString(timeStr,"yyyyMMdd HHmmss");;
					}//其他类型遇到再添加
					 */			
					
					mt.invoke(o, value);
				}					
			}
		}
		return o;
	}
	
	
	
	/**
	 * 将map转换为datacontainer
	 * @param paramMap
	 * @return
	 * @throws Exception
	 * @return: DataContainer
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-3-27 下午12:28:07
	 */
	public static  DataContainer makeParam(Map paramMap)throws Exception
	{
		DataContainer resultContainer =new DataContainer();
		for (Iterator iterator = paramMap.entrySet().iterator(); iterator.hasNext();) 
		{
			Map.Entry param = (Map.Entry) iterator.next();
			if(param.getValue()!=null&&StringUtils.isNotBlank(param.getValue().toString()))
				resultContainer.set(param.getKey().toString(), param.getValue());
		}
		return resultContainer;
	}
	
	/**
	 * 将Ivalue转换成Map, 其中map的key符合接口文档中定义大小写格式
	 * @param valueMap
	 * @return
	 * @throws Exception
	 * @return: Map
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-3-27 下午02:40:58
	 */
	public static Map value2Map(DataStructInterface valueInfo)throws Exception
	{
		return value2Map(valueInfo,true);
	}
	
	//flag 是否进行toProperName操作  如CustId 转换为 Cust_Id
	public static Map value2Map(DataStructInterface valueInfo,boolean flag)throws Exception
	{
		if(valueInfo==null)
		{
			return null;
		}
		Method[] mthds=valueInfo.getClass().getDeclaredMethods();
		Map returnMap=new HashMap();
		Map<String,Method> methodMap=new HashMap<String,Method>();
		//遍历mthds数组，将get方法放进keymap
		for(int i=0;i<mthds.length;i++)
		{
			String methodName=mthds[i].getName();
			if(methodName.startsWith("get"))
			{
				if(!methodName.contains("InitialValue"))
				{
				   methodMap.put(methodName.substring(3),mthds[i]);
				}
			}
		}
		//遍历keyMap，将所有键值对放进resultMap
		SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
		for (Iterator<Map.Entry<String, Method>> iterator = methodMap.entrySet().iterator(); iterator.hasNext();) 
		{
			Map.Entry<String,Method> keyMethod = (Map.Entry<String,Method>) iterator.next();
			Method method = (Method)keyMethod.getValue() ;
			
			Object value=method.invoke(valueInfo,new Class[]{});
			
			//如果value是时间，转换为YYYYMMDD HHmmSS的string格式 //Timestamp.class.equals(tp)
			String key=null;
			if(flag)
				key=toProperName(keyMethod.getKey()).toUpperCase();
			else
				key=keyMethod.getKey();
			
			if(value!=null&&StringUtils.isNotBlank(value.toString()))
			{
				if(value instanceof Timestamp)
					value=dateFormat.format(value);
				returnMap.put(key, value.toString());
			}
			else
				returnMap.put(key, value==null?"":value);	
		}
		
		return returnMap;
	}
	
	/**
	 * 将参数转换为匹配的properName
	 * @param key
	 * @return
	 * @throws Exception
	 * @Function: toProperName
	 * @author: Liaosc
	 * @date: 2012-4-13 下午6:26:26 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-13       Liaosc        v1.0.0               修改原因
	 */
	public static String toProperName(String key)throws Exception
	{
		char result[]=new char[(key.length()+5)];
		int j=1;
		result[0]=key.charAt(0);
		for (int i = 1; i < key.length(); i++) 
		{
			String test=String.valueOf(key.charAt(i));
			if(test.matches("[A-Z]"))
				result[j++]='_';
			result[j++]=key.charAt(i);
		}
		String res=new String(result);
		return res.trim();
	}
	/**
	 * 修改时处理信息
	 * @param containerFr
	 * @param containerTo
	 * @return
	 * @throws Exception
	 * @return: DataContainer
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-3-29 下午04:06:10
	 */
	public  static DataContainer modifyUtil(DataContainer containerFr,DataContainer containerTo)throws Exception{
		String[] key=containerFr.getPropertyNames();
		for (int i = 0; i < key.length; i++) {	
			if(containerFr.get(key[i])!=null){
				containerTo.set(key[i], containerFr.get(key[i]));
			}
		}
		return containerTo;
	}
	
	public static void copyNewProperties(DataStructInterface target,DataStructInterface source) throws Exception
	{
		for(Iterator it=source.getNewProperties().entrySet().iterator();it.hasNext();)
		{
			Entry entry=(Entry)it.next();
			target.set((String)entry.getKey(), entry.getValue());
		}
	}

	/**
	 * 
	 * @param args
	 * @throws Exception
	 * @return: void
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-3-27 下午02:09:44
	 */
	 public static void main(String[] args)throws Exception{
		 Map mapInfo=new HashMap();
		 mapInfo.put("PartyId", 1001);
		 mapInfo.put("PartyType", 1);
		 mapInfo.put("PartyName", "Lsc");
		 CmFSVUtil cmUtil=new CmFSVUtil();
		 Object o=cmUtil.map2Object(PartyBean.class,mapInfo);
		 PartyBean bean=(PartyBean)o;
		 mapInfo.clear();
		 mapInfo=value2Map(bean);
		 int i=0;
		 for (Iterator iterator = mapInfo.entrySet().iterator(); iterator.hasNext();) {
			 i++;			
		}
		 		 
	 }
}
