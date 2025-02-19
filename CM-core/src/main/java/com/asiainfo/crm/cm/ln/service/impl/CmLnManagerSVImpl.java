package com.asiainfo.crm.cm.ln.service.impl;

import org.apache.commons.lang.StringUtils;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
//import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.common.ivalues.IBOCustManagerTeamRelValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmCustManagerTeamValue;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnManagerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustManagerTeamSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

public class CmLnManagerSVImpl implements ICmLnManagerSV {

//	private transient Log log = LogFactory.getLog(CmLnManagerSVImpl.class);
	
	public DataContainer[] qryManager(String criteria, int start, int end) throws Exception {
		if (StringUtils.isBlank(criteria)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
//		log.debug("caiy===========>criteria=["+criteria+"]");
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		if(dts!=null && dts.length>0)
		{
			DataContainer dt = dts[0];
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			String billId = "";
			int managerType = 5;  //默认为查询电话客户经理
			String managerName = "";
			String districtId = "";
			String countyId = "";
			long[] managerId = null;
			long teamId = -1L;
			String teamName = "";
			long staffId = -1L;
			long orgId = -1L;
//			long staffId2 = -1l;
			String loginCode = "";
			billId = dt.getAsString("BILL_ID");
			managerType = dt.getAsInt("MANAGER_TYPE");
			managerName = dt.getAsString("STAFF_NAME");
			districtId = dt.getAsString("REGION_CODE");
			countyId = dt.getAsString("COUNTY_CODE");
			teamId = dt.getAsLong("TEAM_ID");
			orgId = dt.getAsLong("ORG_ID");
			
			//modify by caiyu 20121209 修改未处理的staffId
			staffId = dt.getAsLong("STAFF_ID");
			loginCode = dt.getAsString("LOGIN_CODE");
			
//			if(loginCode != null && !("".equals(loginCode)))
//			{
//				IBOSecOperatorValue ov = iseCm.getOperatorByCode(loginCode);
//				if(ov!=null)
//				{
//					staffId2 = ov.getStaffId();
//				}
//			}
//			log.debug("***************************************************");
//			log.debug("staffId=["+staffId+"]");
//			log.debug("staffId2=["+staffId2+"]");
//			log.debug("***************************************************");
//			if(staffId > 0)
//			{
//				if(staffId2 >0)
//				{
//					if(staffId != staffId2)
//					{
//						return new DataContainer[0]; 
//					}
//				}
//			}
//			else
//			{
//				if(staffId2 >0)
//				{
//					staffId = staffId2;
//				}
//			}
//			log.debug("---------------------------------------------");
//			log.debug("staffId=["+staffId+"]");
//			log.debug("staffId2=["+staffId2+"]");
//			log.debug("---------------------------------------------");
			
			if(teamId>0)
			{
				//查询条件中有电话经理组
				ICmCustManagerTeamSV cmt = (ICmCustManagerTeamSV)ServiceFactory.getService(ICmCustManagerTeamSV.class);
				
				IBOCmCustManagerTeamValue[] tvalues = cmt.queryCmCustManagerTeamByTeamId(teamId);
				if(tvalues!=null && tvalues.length>0)
					teamName = tvalues[0].getTeamName();
				
				IBOCustManagerTeamRelValue[] values = cmt.queryCmCustManagerTeamRelByTeamId(teamId);
				if(values!=null && values.length>0)
				{
					//该电话经理组下有电话经理
					managerId = new long[values.length];
					for(int i=0;i<values.length;i++)
					{
						managerId[i] = 0L;
						managerId[i] = values[i].getManagerId();
					}
				}
				else
				{
					managerId = null;
				}
			}
			else
			{
				managerId = null;
			}
//			if(managerId!=null)
//				log.debug("caiy=================>managerId.length=["+managerId.length);
//			log.debug("caiy=================>billId=["+billId);
//			log.debug("caiy=================>managerType=["+managerType);
//			log.debug("caiy=================>managerName=["+managerName);
//			log.debug("caiy=================>districtId=["+districtId);
//			log.debug("caiy=================>countyId=["+countyId);
//			log.debug("caiy=================>staffId=["+staffId);
//			log.debug("caiy=================>orgId=["+orgId);
//			log.debug("caiy=================>start=["+start);
//			log.debug("caiy=================>end=["+end);
//			log.debug("caiy=================>teamName=["+teamName);
			
			IQBOSecCustManagerValue[] newValues = iseCm.getCustManager(billId,managerType,managerName,districtId,
					countyId,managerId,staffId,orgId,loginCode,start,end);
			
			if(newValues!=null && newValues.length>0)
			{
				DataContainer[] dcs = new DataContainer[newValues.length];
				for(int j=0;j<newValues.length;j++)
				{
					dcs[j] = new DataContainer();
					//dcs[j].copy(newValues[j]);
					dcs[j].initProperty("MANAGER_ID", newValues[j].getManagerid());
					dcs[j].initProperty("STAFF_NAME", newValues[j].getManagername());
					dcs[j].initProperty("BILL_ID", newValues[j].getBillid());
					dcs[j].initProperty("REGION_CODE", newValues[j].getDistrictId());
					dcs[j].initProperty("COUNTY_CODE", newValues[j].getCountyId());
					dcs[j].initProperty("STAFF_ID", newValues[j].getStaffId());
					dcs[j].initProperty("MEMBERTYPE", newValues[j].getMembertype());
					dcs[j].initProperty("ORGSTATE", newValues[j].getOrgstate());
					dcs[j].initProperty("DONE_DATE", newValues[j].getDoneDate());
					dcs[j].initProperty("PROVINCE_ID", newValues[j].getProvinceId());
					dcs[j].initProperty("NOTES", newValues[j].getNotes());
					dcs[j].initProperty("MANAGER_TYPE", newValues[j].getManagerType());
					dcs[j].initProperty("DEPTID", newValues[j].getDeptid());
					dcs[j].initProperty("EMAIL", newValues[j].getEmail());
					dcs[j].initProperty("MANAGER_SEX", newValues[j].getSex());//set文件中定义的是manager_sex
					dcs[j].initProperty("STAFFSTATE", newValues[j].getStaffstate());
					dcs[j].initProperty("MANAGER_STATUS", newValues[j].getManagerStatus());
					dcs[j].initProperty("LOCK_FLAG", newValues[j].getLockFlag());
					dcs[j].initProperty("ACCT_EXPIRE_DATE", newValues[j].getAcctExpireDate());
					dcs[j].initProperty("VALID_DATE", newValues[j].getValidDate());
					dcs[j].initProperty("STAFF_TYPE", newValues[j].getStaffType());
					dcs[j].initProperty("HOBBY", newValues[j].getHobby());
					dcs[j].initProperty("ACCT_EFFECT_DATE", newValues[j].getAcctEffectDate());
					dcs[j].initProperty("OPERSTATE", newValues[j].getOperstate());
					dcs[j].initProperty("HOME_PHONE", newValues[j].getHomePhone());
					dcs[j].initProperty("OFFICE_PHONE", newValues[j].getOfficePhone());
					dcs[j].initProperty("PARENT_DEPTID", newValues[j].getParentDeptid());
					dcs[j].initProperty("EXPIRE_DATE", newValues[j].getExpireDate());
					dcs[j].initProperty("CODE", newValues[j].getCode());
					dcs[j].initProperty("OWNER_AREA", newValues[j].getOwnerArea());
					dcs[j].initProperty("DEPTNAME", newValues[j].getDeptname());
					
					//客户管理自己的数据
					dcs[j].initProperty("TEAM_NAME", teamName);
					dcs[j].initProperty("TEAM_ID", (teamId>0L?teamId:0L));
				}
				return dcs;
			}
			else
			{
				return new DataContainer[0];
			}
		}
		else
		{
			return new DataContainer[0];
		}
	}
	
	public int qryManagerCount(String criteria) throws Exception {
		int re_num =0;
		if (StringUtils.isBlank(criteria)) {
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		if(dts!=null && dts.length>0)
		{
			DataContainer dt = dts[0];
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			String billId = "";
			int managerType = 5;  //默认为查询电话客户经理
			String managerName = "";
			String districtId = "";
			String countyId = "";
			long[] managerId = null;
			long teamId = -1L;
			long staffId = -1L;
			long orgId = -1L;
//			long staffId2 = -1l;
			String loginCode = "";
			billId = dt.getAsString("BILL_ID");
			managerType = dt.getAsInt("MANAGER_TYPE");
			managerName = dt.getAsString("STAFF_NAME");
			districtId = dt.getAsString("REGION_CODE");
			countyId = dt.getAsString("COUNTY_CODE");
			teamId = dt.getAsLong("TEAM_ID");
			orgId = dt.getAsLong("ORG_ID");
			
			//modify by caiyu 20121209 修改未处理的staffId
			staffId = dt.getAsLong("STAFF_ID");
			loginCode = dt.getAsString("LOGIN_CODE");
			
//			if(loginCode != null && !("".equals(loginCode)) )
//			{
//				IBOSecOperatorValue ov = iseCm.getOperatorByCode(loginCode);
//				if(ov!=null)
//				{
//					staffId2 = ov.getStaffId();
//				}
//			}
//			if(staffId > 0)
//			{
//				if(staffId2 >0)
//				{
//					if(staffId != staffId2)
//					{
//						return 0; 
//					}
//				}
//			}
//			else
//			{
//				if(staffId2 >0)
//				{
//					staffId = staffId2;
//				}
//			}
			
			if(teamId>0)
			{
				//查询条件中有电话经理组
				ICmCustManagerTeamSV cmt = (ICmCustManagerTeamSV)ServiceFactory.getService(ICmCustManagerTeamSV.class);
				IBOCustManagerTeamRelValue[] values = cmt.queryCmCustManagerTeamRelByTeamId(teamId);
				if(values!=null && values.length>0)
				{
					//该电话经理组下有电话经理
					managerId = new long[values.length];
					for(int i=0;i<values.length;i++)
					{
						managerId[i] = 0L;
						managerId[i] = values[i].getManagerId();
					}
				}
				else
				{
					managerId = null;
				}
			}
			else
			{
				managerId = null;
			}
			
			re_num = iseCm.getCustManagerCount(billId, managerType, managerName, districtId, countyId, managerId, staffId, orgId, loginCode);
			return re_num ;
//			IQBOSecCustManagerValue[] newValues = iseCm.getCustManager(billId,managerType,managerName,districtId,
//					countyId,managerId,staffId,orgId,loginCode,-1,-1);
//			
//			if(newValues!=null && newValues.length>0)
//			{
//				return newValues.length;
//			}
//			else
//			{
//				return 0;
//			}
		}
		else
		{
			return 0;
		}
	}
}
