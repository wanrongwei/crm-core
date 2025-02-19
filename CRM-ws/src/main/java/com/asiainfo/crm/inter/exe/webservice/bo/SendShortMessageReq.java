package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;
import com.asiainfo.crm.common.jsonparse.DateDeserializer;


public class SendShortMessageReq implements Serializable {
	
	@JsonProperty(value="DestNum")
	public String destNum;
	public String getDestNum() {
		return destNum;
	}

	public void setDestNum(String destNum) {
		this.destNum = destNum;
	}
	@JsonProperty(value="Port")
	public String port;
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	@JsonProperty(value="OptCode")
	public String optCode;
	public String getOptCode() {
		return optCode;
	}

	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}
	@JsonProperty(value="SMSSendTime")
	public String sMSSendTime;
	public String getSMSSendTime() {
		return sMSSendTime;
	}

	public void setSMSSendTime(String sMSSendTime) {
		this.sMSSendTime = sMSSendTime;
	}
	@JsonProperty(value="SMSType")
	public String sMSType;
	public String getSMSType() {
		return sMSType;
	}

	public void setSMSType(String sMSType) {
		this.sMSType = sMSType;
	}
	@JsonProperty(value="Title")
	public String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@JsonProperty(value="Content")
	public String content;
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


}