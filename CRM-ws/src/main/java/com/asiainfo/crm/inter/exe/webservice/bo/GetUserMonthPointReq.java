package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateDeserializer;
import com.asiainfo.crm.common.jsonparse.DateSerializer;

public class GetUserMonthPointReq implements Serializable {
	
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="UserId")
	public long userId;
	@JsonProperty(value="StartDate")
	@JsonSerialize(using=DateSerializer.class)
	public Date startDate;
	@JsonProperty(value="EndDate")
	@JsonSerialize(using=DateSerializer.class)
	public Date endDate;
	public String getServiceNum() {
		return serviceNum;
	}
	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

}
