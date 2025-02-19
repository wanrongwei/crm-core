package com.asiainfo.crm.so.exe.remote.third;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConfirmResultDataBean implements Serializable{

	/**
	 * 
	 */
	private transient static  final Log log = LogFactory.getLog(ConfirmResultDataBean.class);
	private static final long serialVersionUID = 324266004940320716L;
	private String result;//操作结果
	private String resultDesc;
	private Map otherInfo;//扩展信息
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getResultDesc() {
		return resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public Map getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(Map otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String toString(){
		Class c=this.getClass();
		Method[] ms=c.getMethods();
		String mn;
		String temp;
		int k=1;
		StringBuffer sb=new StringBuffer();
		try {
			for(int i=0;i<ms.length;i++){
				mn=ms[i].getName();
				if(mn==null||"getClass".equals(mn)) {
					continue;
				}
				k=mn.indexOf("get");
				if(k!=-1&&ms[i].getParameterTypes().length==0){
						temp=mn.substring(k+3);
						if(temp!=null){
							String pc=temp.substring(0,1);
							temp=temp.replaceFirst(pc,pc.toLowerCase());
							sb.append(temp).append(":").append(ms[i].invoke(this,null)).append("\n");
						}
				}
				
			}
		} catch (Exception e) {
			//
			log.error(e);
		}
		return sb.toString();
	}
}
