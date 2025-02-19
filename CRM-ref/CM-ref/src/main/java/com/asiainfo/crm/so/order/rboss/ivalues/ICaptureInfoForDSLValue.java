package com.asiainfo.crm.so.order.rboss.ivalues;

import java.io.Serializable;

public interface ICaptureInfoForDSLValue extends  Serializable{
	
    public String getPreqResult();
	
	public void setPreqResult(String preqResult);
	
	public String getManualOrder();
	
	public void setManualOrder(String manualOrder);
	
	public String getManualSelCo();
	
	public void setManualSelCo(String manualSelCo);

	public IActValue getActValue();
	
	public void setActValue(IActValue actValue);
	
	public ICheckPSTNValue getCheckPSTNValue();
	
	public void setCheckPSTNValue(ICheckPSTNValue checkPSTNValue);
	
}
