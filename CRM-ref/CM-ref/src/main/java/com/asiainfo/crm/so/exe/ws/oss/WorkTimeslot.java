package com.asiainfo.crm.so.exe.ws.oss;

import java.io.Serializable;
import java.util.List;

/**
 * SFF返回OnlineDate和Timeslot信息
 * 
 * @author PangYong
 */
public class WorkTimeslot implements Serializable{

	private String date;
	private List<String> timeFromToList;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getTimeFromToList() {
		return timeFromToList;
	}

	public void setTimeFromToList(List<String> timeFromToList) {
		this.timeFromToList = timeFromToList;
	}
}
