package com.asiainfo.crm.vo;

import com.asiainfo.crm.constant.Constant;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParamKey implements Iterator,Serializable {

	private static final long serialVersionUID = 7109092935202700191L;
	
	private static transient Log log = LogFactory.getLog(ParamKey.class);
	private static Pattern pattern = Pattern.compile("(.+)\\[(\\d*)\\]");	//匹配A[0]格式
	
	//报文public部分
	//交易流水
	public static final ParamKey TRANSACTION_ID = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.TRANSACTIONID);
	//交易时间
	public static final ParamKey TRANSACTION_TIME = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.TRANSACTIONTIME);
	//接口标识
	public static final ParamKey INTERFACE_ID = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.INTERFACEID);
	//接口类型
	public static final ParamKey INTERFACE_TYPE = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.INTERFACETYPE);
	//销售渠道
	public static final ParamKey SALE_CHANNEL = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.INTERFACEID);
	//操作员Id
	public static final ParamKey OPER_ID = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.OPID);
	//操作员组织Id
	public static final ParamKey ORG_ID = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.ORGID);
	//操作员登录地区标识
	public static final ParamKey REGION_CODE = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.REGIONCODE);
	//操作员登录县市标识
	public static final ParamKey COUNTY_CODE = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.COUNTYCODE);
	//客户端IP
	public static final ParamKey CLIENT_IP = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.CLIENTIP);
	//业务编码
	public static final ParamKey BUSI_CODE = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT  +Constant.PublicInfo.BUSICODE);
			//new ParamKey(Constant.PublicInfo.REQUEST + Constant.Common.POINT + Constant.PublicInfo.BUSICODE);
	//租户
	public static final ParamKey TENANT_ID = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.TENANTID);
	//业务参数
	public static final ParamKey BUSI_PARAMS = new ParamKey(Constant.PublicInfo.BUSIPARAMS);
		//new ParamKey(Constant.PublicInfo.REQUEST + Constant.Common.POINT + Constant.PublicInfo.BUSIPARAMS);
	//店员编码
	public static final ParamKey CLERK_ID = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.CLERKID);
	// AppKey
	public static final ParamKey APP_KEY = new ParamKey(Constant.PublicInfo.PUBINFO + Constant.Common.POINT + Constant.PublicInfo.APPKEY);
	
	//返回报文
	//服务调用返回编码
	public static final ParamKey RETURN_CODE = new ParamKey(Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.CODE);
		//new ParamKey(Constant.PublicInfo.RESPONSE + Constant.Common.POINT + Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.CODE);
	//服务调用返回信息
	public static final ParamKey RETURN_MESSAGE = new ParamKey(Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.MESSAGE); 
		//new ParamKey(Constant.PublicInfo.RESPONSE + Constant.Common.POINT + Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.MESSAGE);
	//服务调用提示信息
	public static final ParamKey RETURN_HINT = new ParamKey(Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.HINT);
		//new ParamKey(Constant.PublicInfo.RESPONSE + Constant.Common.POINT + Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.HINT);
	//服务调用返回参数
	public static final ParamKey RETURN_INFO = new ParamKey(Constant.PublicInfo.RETINFO); 
		//new ParamKey(Constant.PublicInfo.RESPONSE + Constant.Common.POINT + Constant.PublicInfo.RETINFO);
	public static final ParamKey RETURN_TRANSACATIONID = new ParamKey(Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.TRANSACTIONID);
	public static final ParamKey RETURN_RSPTRANSID = new ParamKey(Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.RSPTRANSACTIONID);
	public static final ParamKey RETURN_RSPTIME = new ParamKey(Constant.PublicInfo.ERRORINFO + Constant.Common.POINT + Constant.PublicInfo.RSPTIME);
	
	private String originalKey = null;
	private String key = null;	//实际key值，用于Map中get方法，如A[0].B的两个key值为A和B
	private boolean list = false;	//当前key值对应的是否为List，包含[]的判定为List
	private int position = -1;	//当list为true时，该值表示当前list的第几个节点，默认为-1
	private boolean end = true;	//当前key值是否最后一个，如果为最后一个则返回该key对应的结果
	private ParamKey nextKey = null;	//当前key值的下一个key值
	
	/**
	 * @param originalKey 使用如A[0].B这样的原始key获取迭代ParamKey对象
	 */
	ParamKey(String originalKey) {
		if(StringUtils.isNotBlank(originalKey)) {
			//key值全部转换为指定大小写格式
			originalKey = Constant.transferConstant(originalKey);
			//解析原始key，获取第一个key和剩余key
			String firstKey = null;	//第一个key
			String remainKey = null;	//剩余部分的key
			
			int firstPointIndex = originalKey.indexOf(".");
			if(firstPointIndex < 0) {
				firstKey = originalKey;
			}else if(firstPointIndex == 0) {
				int secPointIndex = originalKey.indexOf(".", firstPointIndex+1);
				if(secPointIndex < 0) {
					firstKey = originalKey.substring(1);
				}else{
					firstKey = originalKey.substring(1, secPointIndex);
					remainKey = originalKey.substring(secPointIndex+1);
				}
			}else {
				firstKey = originalKey.substring(0, firstPointIndex);
				remainKey = originalKey.substring(firstPointIndex+1);
			}
			
			//第一个key设置当前ParamKey对象
			Matcher matcher = pattern.matcher(firstKey);
			if(matcher.find()) {	//符合A[0]格式
				this.key = matcher.group(1);
				this.list = true;
				this.position = Integer.parseInt(matcher.group(2));
			}else {
				this.key = firstKey;
			}
			
			//生成下一个key的ParamKey对象
			if(StringUtils.isNotBlank(remainKey)) {
				this.end = false;
				this.nextKey = new ParamKey(remainKey);
			}
			this.originalKey = originalKey;
		}
	}
	
	public String getOriginalKey() {
		return this.originalKey;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public boolean isList() {
		return this.list;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public boolean hasNext() {
		return !this.end;
	}

	public Object next() {
		return this.nextKey;
	}

	public void remove() {
		if(log.isErrorEnabled()) {
			log.error("The object does not support the remove operation!");
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		result.append("KEY:").append(getKey()).append("\tIS LIST")
		.append(isList()).append("\tINDEX IN LIST").append(getPosition())
		.append("\tIS LAST ONE").append(end).append("\n");
		
		if(next() != null) {
			result.append(next());
		}
		
		return result.toString();
	}

//	public static void main(String[] args) throws Exception {
//		ParamKey paramKey = new ParamKey("a.B[0].C[10].D");
//		System.out.println(TRANSACTION_ID.getOriginalKey());
//		System.out.println(paramKey.getKey());
//		while(paramKey.hasNext()) {
//			paramKey = (ParamKey)paramKey.next();
//			System.out.println(paramKey.getKey());
//		}
//	}
}
