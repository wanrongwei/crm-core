package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class PageResultInfo implements Serializable {
	
	@JsonProperty(value="CurrentPage")
	public int currentPage;
	@JsonProperty(value="PageTotal")
	public int pageTotal;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}
	 

}
