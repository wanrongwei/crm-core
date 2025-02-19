package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class BalanceTransformRuleQueryRetInfo implements Serializable {

	public TargetResourceInfo[] targetResourceInfo;

	public TargetResourceInfo[] getTargetResourceInfo() {
		return targetResourceInfo;
	}

	public void setTargetResourceInfo(TargetResourceInfo[] targetResourceInfo) {
		this.targetResourceInfo = targetResourceInfo;
	}
	
}
