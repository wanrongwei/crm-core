package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class GetUserMonthPointRetInfo implements Serializable {
	@JsonProperty(value="MonthScoreInfo")
	public MonthScoreInfo[] monthScoreInfo;

	public MonthScoreInfo[] getMonthScoreInfo() {
		return monthScoreInfo;
	}

	public void setMonthScoreInfo(MonthScoreInfo[] monthScoreInfo) {
		this.monthScoreInfo = monthScoreInfo;
	}
	
	
	
	
}
