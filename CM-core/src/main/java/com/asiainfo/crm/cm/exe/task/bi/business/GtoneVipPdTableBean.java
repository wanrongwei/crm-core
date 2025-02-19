package com.asiainfo.crm.cm.exe.task.bi.business;

import java.io.Serializable;

public class GtoneVipPdTableBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String billId;
	private long userId;
	private long custId;
	private String planName;
	private String vipName;
	private String regionCode;
	private String countyCode;
	private long vipLevelPd;
	private long vipLevelPlan;
	private int operation;
	private long vipLevelNew;
	private String vipCardNo;
	private int isModifyFlag;
	private String remarks;
	private String rowid;
	
	public String getBillId()
	{
		return billId;
	}
	public void setBillId(String billId)
	{
		this.billId = billId;
	}
	public long getUserId()
	{
		return userId;
	}
	public void setUserId(long userId)
	{
		this.userId = userId;
	}
	public long getCustId()
	{
		return custId;
	}
	public void setCustId(long custId)
	{
		this.custId = custId;
	}
	public String getPlanName()
	{
		return planName;
	}
	public void setPlanName(String planName)
	{
		this.planName = planName;
	}
	public String getVipName()
	{
		return vipName;
	}
	public void setVipName(String vipName)
	{
		this.vipName = vipName;
	}
	public String getRegionCode()
	{
		return regionCode;
	}
	public void setRegionCode(String regionCode)
	{
		this.regionCode = regionCode;
	}
	public String getCountyCode()
	{
		return countyCode;
	}
	public void setCountyCode(String countyCode)
	{
		this.countyCode = countyCode;
	}
	public long getVipLevelPd()
	{
		return vipLevelPd;
	}
	public void setVipLevelPd(long vipLevelPd)
	{
		this.vipLevelPd = vipLevelPd;
	}
	public long getVipLevelPlan()
	{
		return vipLevelPlan;
	}
	public void setVipLevelPlan(long vipLevelPlan)
	{
		this.vipLevelPlan = vipLevelPlan;
	}
	public int getOperation()
	{
		return operation;
	}
	public void setOperation(int operation)
	{
		this.operation = operation;
	}
	public long getVipLevelNew()
	{
		return vipLevelNew;
	}
	public void setVipLevelNew(long vipLevelNew)
	{
		this.vipLevelNew = vipLevelNew;
	}
	public String getVipCardNo()
	{
		return vipCardNo;
	}
	public void setVipCardNo(String vipCardNo)
	{
		this.vipCardNo = vipCardNo;
	}
	public int getIsModifyFlag()
	{
		return isModifyFlag;
	}
	public void setIsModifyFlag(int isModifyFlag)
	{
		this.isModifyFlag = isModifyFlag;
	}
	public String getRemarks()
	{
		return remarks;
	}
	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	public String getRowid()
	{
		return rowid;
	}
	public void setRowid(String rowid)
	{
		this.rowid = rowid;
	}
}
