package com.asiainfo.crm.inter.exe.webservice.client.wimp.task;

import java.text.SimpleDateFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * wimp_telenor-dk_activated_YYYYMMDD.csv文件的一些属性及一些校验
 * @author laizq
 * 
 */
public class SubscriberFileName {
	
	private static Log log = LogFactory.getLog(SubscriberFileName.class);
	
	private String prefix;
	private String createTime;
	private String suffix;
	private String name;
	private boolean isValid = false;
	
	
	
	
	
	public String getPrefix() {
		return prefix;
	}


	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}


	public String getCreateTime() {
		return createTime;
	}


	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}


	public String getSuffix() {
		return suffix;
	}


	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isValid() {
		return isValid;
	}


	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

   
	public SubscriberFileName(String name){
		this.name = name;
		String[] split = this.name.split("\\.");
		if (split.length == 2) {
			this.suffix = split[1];
			this.prefix = split[0];
			if(!this.suffix.equalsIgnoreCase("csv")){
				this.isValid = false;//不以csv结尾的不用解析
				return;
			}
			String[] fields = split[0].split("_");
			if (fields.length == 4) {
				  if(!checkPrefix(fields)){//文件名称校验不通过
					  this.isValid = false;
					  return;
				  }
				 this.createTime = fields[3];
				 this.isValid = true;
			}
			else {
				this.isValid = false;
			}
		}else {//文件名称不符合要求
			this.isValid = false;
		}
		
	}
	
	/**
	 * 校验文件前缀 wimp_telenor-dk_activated_YYYYMMDD
	 * @param fields
	 * @return
	 * 
	 */
	public boolean checkPrefix(String[] fields){
		if(!fields[0].equalsIgnoreCase("wimp") && 
				!fields[1].equalsIgnoreCase("telenor-dk") &&
				!fields[2].equalsIgnoreCase("activated")){
			return false;
		}
		
		//校验YYMMDD
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		try {
			sf.parse(fields[3]);
		} catch (Exception e) {
			log.info(e.getMessage(),e);
			return false;
		}
		
		return true;
	}
	
}
