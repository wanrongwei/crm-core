package com.asiainfo.crm.vo;

import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.constant.Constant;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangdz
 * @description 统一接口业务对象，继承自HashMap，重写了get和put方法，以支持对类型为A[0].B及A.B的键值的读取和指定。
 */
public class ServiceParam extends HashMap {
	
	private static transient Log log = LogFactory.getLog(ServiceParam.class);
	
	private static final long serialVersionUID = 1L;
	
	public static final Map systemErrInfo = new ServiceParam("9999",CrmLocaleFactory.getResource("INS000000009999"));
	public static final Map formatErrInfo = new ServiceParam("9995",CrmLocaleFactory.getResource("INS000000000001"));
	
	public static final String SUCCESS_CODE = "0000";
	public static final String NON_RESULT_CODE = "1045";
	public static final String ERROR_CODE = "9999";
	
	public ServiceParam() {
		super();
	}
	
	public ServiceParam(String returnCode, String returnMsg) {
		super();
		put(ParamKey.RETURN_CODE, returnCode);
		put(ParamKey.RETURN_MESSAGE, returnMsg);
		put(ParamKey.RETURN_HINT, "1");
	}
	
//	public String getTransactionId() {
//		return (get(ParamKey.TRANSACTION_ID) == null) ? Constant.Common.EMPTY : get(ParamKey.TRANSACTION_ID).toString();
//	}
//	
//	public void setTransactionId(String transactionId){
//		put(ParamKey.TRANSACTION_ID, transactionId);
//	}
//	
//	public String getTransactionTime() {
//		return (get(ParamKey.TRANSACTION_TIME) == null) ? Constant.Common.EMPTY : get(ParamKey.TRANSACTION_TIME).toString();
//	}
//
//	public void setTransactionTime(String transactionTime){
//		put(ParamKey.TRANSACTION_TIME, transactionTime);
//	}
//	
//	public String getInterfaceId() {
//		return (get(ParamKey.INTERFACE_ID) == null) ? Constant.Common.EMPTY : get(ParamKey.INTERFACE_ID).toString();
//	}
//
//	public void setInterfaceId(String interfaceId){
//		put(ParamKey.INTERFACE_ID, interfaceId);
//	}
//	
//	public String getInterfaceType() {
//		return (get(ParamKey.INTERFACE_TYPE) == null) ? Constant.Common.EMPTY : get(ParamKey.INTERFACE_TYPE).toString();
//	}
//	
//	public void setInterfaceType(String interfaceType){
//		put(ParamKey.INTERFACE_TYPE, interfaceType);
//	}
//
//	public String getOperId() {
//		return (get(ParamKey.OPER_ID) == null) ? Constant.Common.EMPTY :get(ParamKey.OPER_ID).toString();
//	}
//	
//	public void setOperId(String operId){
//		put(ParamKey.OPER_ID, operId);
//	}
//
//	public String getOrgId() {
//		return (get(ParamKey.ORG_ID) == null) ? Constant.Common.EMPTY : get(ParamKey.ORG_ID).toString();
//	}
//
//	public void setOrgId(String orgId){
//		put(ParamKey.ORG_ID, orgId);
//	}
//	
//	public String getRegionCode() {
//		return (get(ParamKey.REGION_CODE) == null) ? Constant.Common.EMPTY : get(ParamKey.REGION_CODE).toString();
//	}
//	
//	public void setRegionCode(String regionCode){
//		put(ParamKey.REGION_CODE, regionCode);
//	}
//
//	public String getCountyCode() {
//		return (get(ParamKey.COUNTY_CODE) == null) ? Constant.Common.EMPTY : get(ParamKey.COUNTY_CODE).toString();
//	}
//	
//	public void setCountyCode(String countyCode){
//		put(ParamKey.COUNTY_CODE, countyCode);
//	}
//
//	public String getReturnCode() {
//		return (get(ParamKey.RETURN_CODE) == null) ? Constant.Common.EMPTY : get(ParamKey.RETURN_CODE).toString();
//	}
//	
//	public void setReturnCode(String returnCode){
//		put(ParamKey.RETURN_CODE, returnCode);
//	}

//	public String getReturnMessage() {
//		return (get(ParamKey.RETURN_MESSAGE) == null) ? Constant.Common.EMPTY : get(ParamKey.RETURN_MESSAGE).toString();
//	}
//
//	public void setReturnMessage(String returnMessage){
//		put(ParamKey.RETURN_MESSAGE, returnMessage);
//	}
	
	/**
	 * @author zhangdz
	 * @description 重写HashMap的Put方法，实现对形如A[0].B..或A.B的key值的put操作 
	 * @paramkey  key应该ParamKey包装，否则调用HashMap的put操作
	 * @param value
	 * @return: Object 为key对应的旧的值
	 */
	public Object put(Object key, Object value){
		Object retObj = null;
		
		//支持ParamKey形式的，ParamKey param = new ParamKey(Str);
		if(key != null && key instanceof ParamKey){
			StringBuilder sb = null;
			
			ServiceParam param = null;
			
			ParamKey paramKey = (ParamKey)key;
			String realKey = paramKey.getKey();
			int listId = paramKey.getPosition();
			Object trueValue = get(realKey);
			if(paramKey.isList()){
				List list = null;
				//A[0].B形式时，当trueValue为空时，需新建一个List
				if(trueValue == null){
					list = new ArrayList();
					put(realKey, list);
				//当trueValue为List时
				}else if(trueValue instanceof List){
					list = (List)trueValue;
					//当list不是依次添加值的时候，如果越界部分长度过大则不可添加
					if(listId - list.size() > Constant.Common.MAX_LISTID){
						if(log.isInfoEnabled()){
							sb = new StringBuilder();
							sb.append("KEY[").append(realKey).append("] INDEX[").append(listId).append("]Over the biggest cross-border index value, does not support this operation!");
							log.info(sb);
						}
						return null;
					}
				}else{//其他情况都不予支持
					if(log.isInfoEnabled()){
						sb = new StringBuilder();
						sb.append("KEY[").append(realKey).append("]The corresponding value is not a List, do not support this operation!");  // [").append(trueValue).append("]
						log.info(sb);
					}
					return null;
				}
				while(list.size() <= listId){
					list.add(null);
				}
				//取出key对应的值
				Object object = list.get(listId);
				//A[0].B形式
				if(paramKey.hasNext()){
					if(object instanceof ServiceParam){
						param = (ServiceParam)object;
					}else{
						param = new ServiceParam();
						list.set(listId, param);
					}
					retObj = param.put(paramKey.next(), value);
				}else{//A[0]形式
					list.set(listId, value);
					retObj = object;
				}
			}else{//A.B形式
				if(paramKey.hasNext()){
					if(trueValue != null && trueValue instanceof ServiceParam){
						param = (ServiceParam)trueValue;
						retObj = param.put(paramKey.next(), value);
					}else{
						param = new ServiceParam();
						param.put(paramKey.next(), value);
						retObj = put(realKey, param);
					}
				}else{//A形式
					retObj = put(realKey, value);
				}
			}
		}else if(key != null){
			if(key instanceof String ){
				if(((String)key).indexOf(Constant.Common.POINT) >= 0 || ((String)key).indexOf("[") > 0){
					put(ParamKeyCache.get((String)key), value);
				}else{
				    super.put(Constant.transferConstant(((String)key)), value);
				}
			}else{
				super.put(key, value);
			}
				
		}
		return retObj;
	}

	
	
//	public static Object getValueByParamKey(Map map , ParamKey key) throws Exception{
//		return ExpressionUtil.evaluate(key.getOriginalKey(), map);
//	}
	
	/**
	 *  接口服务返回参数统一封装
	 * @param map 返回Map  对用 RetInfo 节点
	 * @param code 如无特殊需求传空
	 * @param msg	 如无特殊需求传空
	 * @param hint	 如无特殊需求传空
	 * @return
	 */
	public static ServiceParam packReturn(Map map , String code , String msg , String hint){
		ServiceParam params = new ServiceParam();
		if(StringUtils.isNotBlank(code)){
			params.put(ParamKey.RETURN_CODE, code);
		}
		
		if(StringUtils.isBlank(code)  &&  (null != map && map.isEmpty())){
			params.put(ParamKey.RETURN_CODE, ServiceParam.NON_RESULT_CODE);
			params.put(ParamKey.RETURN_MESSAGE, CrmLocaleFactory.getResource("INS000000000017"));
//			params.put(ParamKey.RETURN_HINT,  "1");
		}
		
		if(null != map){
			params.put(ParamKey.RETURN_INFO, map);
		}else{
			params.put(ParamKey.RETURN_INFO, new ServiceParam());
		}
		if(StringUtils.isNotBlank(msg)){
			params.put(ParamKey.RETURN_MESSAGE, msg);
		}
//		if(StringUtils.isNotBlank(hint)){
//			params.put(ParamKey.RETURN_HINT, hint);
//		}
		return params;
	}
	

//	public static void main(String[] args){
//		ServiceParam param = new ServiceParam();
		//ParamKey param1 = ParamKeyCache.get("A[0].B[3]");
		//ParamKey param2 = ParamKeyCache.get("A[1].C");
		//ParamKey param3 = ParamKeyCache.get("A[0].B[0].C.D");
		//ParamKey param4 = ParamKeyCache.get("A[2].B[1].E");
		//ParamKey param5 = ParamKeyCache.get("A[1].B[1].D");
		//ParamKey param6 = ParamKeyCache.get("C");
//		param.put(param1, "Hello-A");
//		param.put(param2, "Hello-AA");
//		param.put(param3, "Hello");
//		param.put(param4, "world");
//		param.put(param1, "I am zhangdz");
//		param.put(param5, "zhangdezhao");
//		List list = new ArrayList();
//		list.add("zhang");
//		list.add("zhangdezhao");
//		param.put("C", "value");
//		param.put(param6, list);
//		System.out.println(param);
//		System.out.println(param.get(param1));
//		System.out.println(param.get(param2));
//		System.out.println(param.get(param3));
//		System.out.println(param.get(param4));
//		System.out.println(param.get(param5));
		
		//测试ServiceParam的put和get方法
//		param.setInterfaceId("1001");
//		System.out.println(param.getInterfaceId());
//		param.put("PubInfo.InterfaceId", "1001");
//		System.out.println(param.get("PubInfo.InterfaceId"));
		/*更改put和get方法测试-----2012/2/6*/
//		param.put("A.B", "zhangdz");
//		param.put("c.d.e.f", "testc.d.e.f");
//		Object o = param.get("A.B");
//		System.out.println(param.get("c.d.e.f"));
//		System.out.println(param.get("c.d"));
//		System.out.println(o);
//		Map tMap = new ServiceParam();
//		tMap.put("a", "c");
//		tMap.put("b", "dfdf");
//		List list = new ArrayList();
//		list.add("mmmm");
//		list.add("nnnn");
//		param.put(param6, tMap);
//		param.put(param6, list);
//		param.put("C", list);
//		System.out.println(param);
//		System.out.println(param.get("C[0]"));
		/*更改put和get方法测试结束*/
//		/*测试直接设置List开始*/
//		Map param = new ServiceParam();
//		List list = new ArrayList();
//		Map map1 = new ServiceParam();
//		map1.put("A", "A1");
//		map1.put("B", "B1");
//		list.add(map1);
//		Map map2 = new ServiceParam();
//		map2.put("A", "A2");
//		map2.put("B", "B2");
//		list.add(map2);
//		param.put("Top", list);
//		System.out.println(param.get(new ParamKey("Top[0].A")));
//		System.out.println(param.get(new ParamKey("Top[1].B")));
//		System.out.println(param.get(new ParamKey("Top[2].A")));
//		/*测试直接设置List结束*/
		
//	}
	
	
}
