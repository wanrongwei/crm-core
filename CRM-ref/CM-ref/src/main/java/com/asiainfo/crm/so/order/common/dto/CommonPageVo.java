package com.asiainfo.crm.so.order.common.dto;

import java.io.Serializable;

public class CommonPageVo implements Serializable{
	
	private static final long serialVersionUID = 1773788898744743079L;
	
	private String count;
	private String toalPage;
	private int curentPage;
	private int pageNumber;
	private int start;
	private int end;
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getToalPage() {
		return toalPage;
	}
	public void setToalPage(String toalPage) {
		this.toalPage = toalPage;
	}
	public int getCurentPage() {
		return curentPage;
	}
	public void setCurentPage(int curentPage) {
		this.curentPage = curentPage;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}

}
