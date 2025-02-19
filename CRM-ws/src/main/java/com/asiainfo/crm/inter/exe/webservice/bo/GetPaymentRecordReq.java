package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.asiainfo.crm.common.jsonparse.DateSerializer;

public class GetPaymentRecordReq implements Serializable {
	@JsonProperty(value="ServiceNum")
	public String serviceNum;
	@JsonProperty(value="QueryType")
	public int queryType;
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
	public int getQueryType() {
		return queryType;
	}
	public void setQueryType(int queryType) {
		this.queryType = queryType;
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
