package com.asiainfo.crm.cm.exe.task.bi.business;

import java.io.Serializable;

public class GtoneVipPdSmsNotifyBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String personName;
	private String billId;
	private String email;
	private String regionId;
	private String countyId;
	public String getPersonName()
	{
		return personName;
	}
	public void setPersonName(String personName)
	{
		this.personName = personName;
	}
	public String getBillId()
	{
		return billId;
	}
	public void setBillId(String billId)
	{
		this.billId = billId;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getRegionId()
	{
		return regionId;
	}
	public void setRegionId(String regionId)
	{
		this.regionId = regionId;
	}
	public String getCountyId()
	{
		return countyId;
	}
	public void setCountyId(String countyId)
	{
		this.countyId = countyId;
	}
}
