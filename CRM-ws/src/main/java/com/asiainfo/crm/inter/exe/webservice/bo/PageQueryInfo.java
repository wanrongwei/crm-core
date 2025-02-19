package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class PageQueryInfo implements Serializable{
	
	@JsonProperty(value="PageQuery")
	public int pageQuery;
	@JsonProperty(value="PageCount")
	public int pageCount;
	public int getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(int pageQuery) {
		this.pageQuery = pageQuery;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	 
	

}
