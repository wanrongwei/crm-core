package com.asiainfo.crm.so.order.rboss.ivalues;

import java.io.Serializable;

public interface ICoInfoForDSLValue extends Serializable{
	
    public ITechnologiesValue[] getTechnologiesValue();
	
	public void setTechnologiesValue(ITechnologiesValue[] technologiesValue);
	
	public String getHasPstn();
	
	public void setHasPstn(String hasPstn);
	
	public String getPstnNumber();

	public void setPstnNumber(String pstnNumber);

	public String getIsDefault();
	
	public void setIsDefault(String isDefault);
	
	public String getCoKind();
	
	public void setCoKind(String coKind);
	
	public String getCoDesc();
	
	public void setCoDesc(String coDesc);
	
	public String getCoType();
	
	public void setCoType(String coType);
	
	public String getDb150();
	
	public void setDb150(String db150);
	
	public String getVisitService();
	
	public void setVisitService(String visitService);
	
	public String getCoName();
	
	public void setCoName(String coName);
	
}
