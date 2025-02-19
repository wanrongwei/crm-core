package com.asiainfo.crm.cm.common.util;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;

public class CommonTransUtil implements ITransUtil
{
	private static final String s_memberLevel="MEMBER_LEVEL";
	private static final String s_cityId="CITY_ID";
	private static final String s_countyId="COUNTY_ID";
	private static final String s_regionId = "REGION_ID";
	private static final String s_custId="CUST_ID";
	private static final String s_custStatus = "CUST_STATUS";
	private static final String s_custType = "CUST_TYPE";
	private static final String s_custServiceLevel = "CUST_SERVICE_LEVEL";
	private static final String s_contType = "CONT_TYPE";
	private static final String s_gender = "GENDER";
	private static final String s_grpOrgType = "GRP_ORG_TYPE";
	private static final String s_memberJob = "MEMBER_JOB";
	private static final String s_regionType = "REGION_TYPE";
	private static final String s_memberType = "MEMBER_TYPE";
	private static final String s_memberPosition = "MEMBER_POSITION";
	private static final String s_vocation = "VOCATION";
	private static final String s_subVocation = "SUB_VOCATION";
	private static final String s_secVocation = "SEC_VOCATION";
	
	public void trans(DataContainerInterface dci) throws Exception
	{
		if (dci.get(s_memberLevel) != null) 
		{
			IBOBsStaticDataValue staticValue =StaticDataUtil.getStaticData("CM_CLUB_MEMBER_LEVEL", dci.getAsString(s_memberLevel));
			if(staticValue!=null)
				dci.setExtAttr(s_memberLevel, staticValue.getCodeName());
		}
		
		if (dci.get(s_cityId) != null) 
		{
			IBOBsCommonDistrictValue districtValue =BsCommonDistrictUtil.getCommonDistrictByCode(dci.getAsString(s_cityId), 3);
			if(districtValue!=null)
				dci.setExtAttr(s_cityId, districtValue.getDistrictEnglishName());
		}
		
		if (dci.get(s_countyId) != null) 
		{
			IBOBsCommonDistrictValue districtValue =BsCommonDistrictUtil.getCommonDistrictByCode(dci.getAsString(s_countyId), 4);
			if(districtValue!=null)
				dci.setExtAttr(s_countyId, districtValue.getDistrictEnglishName());
		}
		
		if (dci.get(s_regionId) != null) 
		{
			IBOBsCommonDistrictValue districtValue =BsCommonDistrictUtil.getCommonDistrictByCode(dci.getAsString(s_regionId), 3);
			if(districtValue!=null)
				dci.setExtAttr(s_regionId, districtValue.getDistrictEnglishName());
		}
		
		if(dci.get(s_custId) != null)
		{
			int custType = CmCommonUtil.getCustType(dci.getAsLong(s_custId));
			
			IBOBsStaticDataValue staticValue =StaticDataUtil.getStaticData("CM_CUST_TYPE", String.valueOf(custType));
			if(staticValue !=null)
				dci.setExtAttr(s_custType, staticValue.getCodeName());
			
			if(dci.get(s_custStatus) != null)
			{
				staticValue=StaticDataUtil.getStaticData("CM_CUST_STATUS_"+custType, dci.getAsString(s_custStatus));
				if(staticValue !=null)
					dci.setExtAttr(s_custStatus, staticValue.getCodeName());
			}
			
			if(dci.get(s_custServiceLevel)!=null)
			{
				staticValue=StaticDataUtil.getStaticData("CM_CUST_SERVICE_LEVEL_"+custType, dci.getAsString(s_custServiceLevel));
				if(staticValue !=null)
					dci.setExtAttr(s_custServiceLevel, staticValue.getCodeName());
			}
			
			if(custType ==CmConstants.CustomerType.GROUP)
			{
				if(dci.get(s_vocation)!=null)
				{
					staticValue =StaticDataUtil.getStaticData("CM_VOCATION", dci.getAsString(s_vocation));
					if(staticValue!=null)
						dci.setExtAttr(s_vocation, staticValue.getCodeName());
				}
				if(dci.get(s_subVocation)!=null&&dci.get(s_vocation)!=null)
				{
					staticValue =StaticDataUtil.getStaticData("SEC_VOCATION_"+dci.get(s_vocation).toString(), dci.getAsString(s_subVocation));
					if(staticValue!=null)
						dci.setExtAttr(s_subVocation, staticValue.getCodeName());
				}
				if(dci.get(s_secVocation)!=null&&dci.get(s_subVocation)!=null)
				{
					staticValue =StaticDataUtil.getStaticData("SUB_VOCATION_"+dci.get(s_subVocation).toString(), dci.getAsString(s_secVocation));
					if(staticValue!=null)
						dci.setExtAttr(s_secVocation, staticValue.getCodeName());
				}
				if(dci.get(s_contType)!=null)
				{
					staticValue =StaticDataUtil.getStaticData("CM_GROUP_CUST_CONT_TYPE", dci.getAsString(s_contType));
					if(staticValue!=null)
						dci.setExtAttr(s_contType, staticValue.getCodeName());
				}
				
				if (dci.get(s_memberJob) != null) 
				{
					staticValue =StaticDataUtil.getStaticData("CMX_POSITION", dci.getAsString(s_memberJob));
					if(staticValue!=null)
						dci.setExtAttr(s_memberJob, staticValue.getCodeName());
				}
				
				if (dci.get(s_memberPosition) != null) 
				{
					staticValue =StaticDataUtil.getStaticData("CMX_POSITION", dci.getAsString(s_memberPosition));
					if(staticValue!=null)
						dci.setExtAttr(s_memberPosition, staticValue.getCodeName());
				}
				
				if (dci.get(s_regionType) != null) 
				{
					staticValue =StaticDataUtil.getStaticData("CM_GRP_REGION_TYPE", dci.getAsString(s_regionType));
					if(staticValue!=null)
						dci.setExtAttr(s_regionType, staticValue.getCodeName());
				}
				
				if (dci.get(s_grpOrgType) != null) 
				{
					staticValue =StaticDataUtil.getStaticData("CM_GRP_ORP_TYPE", dci.getAsString(s_grpOrgType));
					if(staticValue!=null)
						dci.setExtAttr(s_grpOrgType, staticValue.getCodeName());
				}
				
				if (dci.get(s_memberType) != null) 
				{
					staticValue =StaticDataUtil.getStaticData("CM_GROUP_MEMBER_TYPE", dci.getAsString(s_memberType));
					if(staticValue!=null)
						dci.setExtAttr(s_memberType, staticValue.getCodeName());
				}
			}
		}
		
		if (dci.get(s_gender) != null) 
		{
			IBOBsStaticDataValue staticValue =StaticDataUtil.getStaticData("CM_GENDER", dci.getAsString(s_gender));
			if(staticValue!=null)
				dci.setExtAttr(s_gender, staticValue.getCodeName());
		}
	}
}