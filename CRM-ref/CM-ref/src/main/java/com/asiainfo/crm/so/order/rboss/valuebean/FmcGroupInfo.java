package com.asiainfo.crm.so.order.rboss.valuebean;

import java.io.Serializable;

/**
  * @ClassName: FmcGroupInfo  
  * @Description: offer信息+offer的fmc信息
  * @author Tan Yan
  * @date 2018年3月21日  
  *
  */
public class FmcGroupInfo implements Serializable{
	
	public String fmcGroupId;//群组唯一编号
	
	public String fmcGroupType;//FMC
	
	public String fmcCountFlag;
	
	public String formulaRule;
	
	public String getFmcGroupId() {
		return fmcGroupId;
	}

	public void setFmcGroupId(String fmcGroupId) {
		this.fmcGroupId = fmcGroupId;
	}

	public String getFmcGroupType() {
		return fmcGroupType;
	}

	public void setFmcGroupType(String fmcGroupType) {
		this.fmcGroupType = fmcGroupType;
	}

	public String getFmcCountFlag() {
		return fmcCountFlag;
	}

	public void setFmcCountFlag(String fmcCountFlag) {
		this.fmcCountFlag = fmcCountFlag;
	}

	public String getFormulaRule() {
		return formulaRule;
	}

	public void setFormulaRule(String formulaRule) {
		this.formulaRule = formulaRule;
	}
}
