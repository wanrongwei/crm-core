package com.asiainfo.crm.so.teaminvoke.in.service.oss.dto;

import java.io.Serializable;
import java.util.List;

public class DayWorkScheduleDTO  implements Serializable {
	private static final long serialVersionUID = -1224433111411122L;
	private String scheduleDate;
	private List<WorkTimeSlotCdDTO> workTimeSlot;
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public List<WorkTimeSlotCdDTO> getWorkTimeSlot() {
		return workTimeSlot;
	}
	public void setWorkTimeSlot(List<WorkTimeSlotCdDTO> workTimeSlot) {
		this.workTimeSlot = workTimeSlot;
	}
 
	
}
