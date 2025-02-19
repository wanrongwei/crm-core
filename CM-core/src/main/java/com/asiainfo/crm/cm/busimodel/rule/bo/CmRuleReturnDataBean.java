package com.asiainfo.crm.cm.busimodel.rule.bo;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.bce.valuebean.BceRuleReturnDataBean;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmRuleReturnData;

public class CmRuleReturnDataBean extends BceRuleReturnDataBean implements ICmRuleReturnData
{
	private static final long serialVersionUID = 8014063693478991753L;

	public void addFailDc(DataContainerInterface failDc)
	{
		super.addFailDc(failDc);
	}

	public void addSuccessDc(DataContainerInterface successDc)
	{
		super.addSuccessDc(successDc);
	}

	public void addWarnningDc(DataContainerInterface warnningDc)
	{
		super.addWarnningDc(warnningDc);

	}

	public DataContainerInterface[] getFailDcList()
	{
		return super.getFailDcList();
	}

	public String getMsg()
	{
		return super.getMsg();
	}

	public int getResultCode()
	{
		return super.getResultCode();
	}

	public DataContainerInterface[] getSuccessDcList()
	{
		return super.getSuccessDcList();
	}

	public DataContainerInterface[] getWarnningDcList()
	{
		return super.getWarnningDcList();
	}

	public void setMsg(String msg)
	{
		super.setMsg(msg);
	}

	public void setResultCode(int resultCode)
	{
		super.setResultCode(resultCode);
	}

	public String getCustomResultCode()
	{
		return super.getCustomResultCode();
	}

	public String getKey()
	{
		return super.getKey();
	}

	public void setCustomResultCode(String customResultCode)
	{
		super.setCustomResultCode(customResultCode);
	}

	public void setMsgByKey(String key)
	{
		super.setMsgByKey(key);
	}

	public void setMsgByKey(String key, Object[] params)
	{
		super.setMsgByKey(key, params);
	}
}
