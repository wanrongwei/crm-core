package com.asiainfo.crm.so.order.rboss.ivalues;

import java.io.Serializable;

public interface ICheckPSTNValue extends  Serializable {
	
	public String getHasPSTN();
	
	public void setHasPSTN(String hasPSTN);
	
	public String getPstnNo();
	
	public void setPstnNo(String pstnNo);
	
	public String getPstnCheck();
	
	public void setPstnCheck(String pstnCheck);
	
}
