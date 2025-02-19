package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;

public class PreOccupyPhoneNumRetInfo implements Serializable {
	@JsonProperty(value="DoneCode")
	public String doneCode;
	@JsonProperty(value="DoneDate")
	@JsonDeserialize(using=DateDeserializer.class)
	public Date doneDate;
	@JsonProperty(value="During")
	public String during;
	public String getDoneCode() {
		return doneCode;
	}
	public void setDoneCode(String doneCode) {
		this.doneCode = doneCode;
	}
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
	public String getDuring() {
		return during;
	}
	public void setDuring(String during) {
		this.during = during;
	}
	
	

}
