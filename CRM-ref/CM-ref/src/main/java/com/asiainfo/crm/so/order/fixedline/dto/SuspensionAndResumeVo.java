package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class SuspensionAndResumeVo extends BaseOrderVo implements Serializable{
	private static final long serialVersionUID = -2539190984220463500L;
    private SuspensionResumeInfoVo suspensionResumeInfo;
    
	public SuspensionResumeInfoVo getSuspensionResumeInfo() {
		return suspensionResumeInfo;
	}
	public void setSuspensionResumeInfo(SuspensionResumeInfoVo suspensionResumeInfo) {
		this.suspensionResumeInfo = suspensionResumeInfo;
	}
	
}
