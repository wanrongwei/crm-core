package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;

public class PreTerminationVo extends BaseOrderVo implements Serializable{
	private static final long serialVersionUID = -2539190984220463500L;
    private List<ReturnInfoVo> returnInfo;
    private TerminationInfoVo terminationInfo;
	public List<ReturnInfoVo> getReturnInfo() {
		return returnInfo;
	}
	public void setReturnInfo(List<ReturnInfoVo> returnInfo) {
		this.returnInfo = returnInfo;
	}
	public TerminationInfoVo getTerminationInfo() {
		return terminationInfo;
	}
	public void setTerminationInfo(TerminationInfoVo terminationInfo) {
		this.terminationInfo = terminationInfo;
	}
	
	
}
