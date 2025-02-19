package com.asiainfo.crm.inter.exe.webservice.bo;

import java.io.Serializable;

public class AccSplitModifyReq implements Serializable {
	
	public long accID;
	
	public SplitMemberInfo[] splitMemberInfo;

	public long getAccID() {
		return accID;
	}

	public void setAccID(long accID) {
		this.accID = accID;
	}

	public SplitMemberInfo[] getSplitMemberInfo() {
		return splitMemberInfo;
	}

	public void setSplitMemberInfo(SplitMemberInfo[] splitMemberInfo) {
		this.splitMemberInfo = splitMemberInfo;
	}

}
