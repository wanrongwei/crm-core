package com.asiainfo.crm.so.order.common.dto;

import java.io.Serializable;

public class PagerDataVo<T> implements Serializable{
	private static final long serialVersionUID = 2515873165541854053L;
	// 分页的数据(当前页面的数据)
	private T[] rows;
	// 数据总数
	private int total;
	
	public T[] getRows() {
		return rows;
	}
	public void setRows(T[] rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
