package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCustManagerTeamImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCustManagerTeamBean;
import com.asiainfo.crm.cm.common.bo.BOCustManagerTeamRelBean;
import com.asiainfo.crm.cm.common.bo.BOCustManagerTeamRelEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOCustManagerTeamRelValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmCustManagerTeamEngine;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmCustManagerTeamValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.service.interfaces.ICmCustManagerTeamSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

public class CmCustManagerTeamSVImpl implements ICmCustManagerTeamSV {

	public int queryCmCustManagerTeamCount(String criteria) throws Exception 
	{
		return ((AbstractCmCustManagerTeamImpl) CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).queryCount(criteria);
	}

	public DataContainer[] queryCmCustManagerTeam(String criteria, int startNum,int endNum) throws Exception 
	{
		//return ((AbstractCmCustManagerTeamImpl)CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).queryData(criteria, startNum, endNum);
		//modify by caiyu 2012-11-22
		DataContainer[] dcs = ((AbstractCmCustManagerTeamImpl)CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).queryData(criteria, startNum, endNum);
		IBOCmCustManagerTeamValue[] pteams = null;
		
		if(dcs!=null && dcs.length > 0)
		{
			for(int i=0;i<dcs.length;i++)
			{
				long pteamid = dcs[i].getAsLong("PARENT_TEAM_ID");
				if(pteamid>0)
				{
					//证明有上级电话经理组
					pteams = this.queryCmCustManagerTeamByTeamId(pteamid);
					if(pteams!=null && pteams.length>0)
					{
						//获取上级电话经理组的名称
						String parent_team_name = pteams[0].getTeamName();
						dcs[i].initProperty("PARENT_TEAM_NAME", parent_team_name);
					}
				}
			}
		}
		return dcs;
	}
	public IBOCmCustManagerTeamValue queryCmCustManagerTeam(long managerId, int startNum,int endNum) throws Exception 
	{
		return ((AbstractCmCustManagerTeamImpl)CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).queryData(managerId, startNum, endNum);
	}
	public void saveCmCustManagerTeam(DataContainer[] values) throws Exception {

		((AbstractCmCustManagerTeamImpl) CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).saveCmCustManagerTeam(values);

	}

	public DataContainer[] queryCustManagerTeamRel(String criteria,
			int startNum, int endNum) throws Exception {
		Map map=new HashMap<String, String>();
		if(criteria == null || "".equals(criteria))
			return null;
		map.put("TEAM_ID", criteria);
		//modify by caiyu 需要增加返回客户经理的信息
		DataContainer[] dcs = ((AbstractCmCustManagerTeamImpl)CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).
		queryData(ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCustManagerTeamRelBean", map), startNum, endNum);
		
		if(dcs!=null && dcs.length>0)
		{
			//循环处理，调用权限接口查询客户经理信息
			long managerId = 0;
			IBOCmCustManagerTeamValue[] teamvalues = this.queryCmCustManagerTeamByTeamId(Long.valueOf(criteria).longValue());
			String teamName = "";
			if(teamvalues!=null && teamvalues.length>0 )
				teamName = teamvalues[0].getTeamName();
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			for(int i=0;i<dcs.length;i++)
			{
				managerId = dcs[i].getAsLong("MANAGER_ID");
				IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(managerId, CmLnConstants.CM_MANAGER_TYPE.STS_5);
				if (CmCommonUtil.isNotEmptyObject(secStaff)) 
				{
					dcs[i].initProperty("TEAM_NAME", teamName);
					dcs[i].initProperty("MANAGER_NAME", secStaff.getManagername());
					dcs[i].initProperty("MANAGER_PHONE",secStaff.getBillid());
					dcs[i].initProperty("MANAGER_SEX", secStaff.getSex());
				}
			}
			
		}
		return dcs;
	}

	public int queryCustManagerTeamRelCount(String criteria) throws Exception {
		Map map=new HashMap<String, String>();
		map.put("TEAM_ID", criteria);
		return ((AbstractCmCustManagerTeamImpl)CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).
		queryCount(ParamUtil.buildQueryXml("com.asiainfo.crm.cm.common.bo.BOCustManagerTeamRelBean", map));
	}

	public void saveCmCustManagerTeamRel(DataContainer[] values)
			throws Exception {
		// TODO Auto-generated method stub
		((AbstractCmCustManagerTeamImpl) CmServiceFactory.getBusiMode(AbstractCmCustManagerTeamImpl.class)).saveCmCustManagerTeamRel(values);

	}

	public IBOCustManagerTeamRelValue[] queryCmCustManagerTeamRelByTeamId(long teamId) throws Exception {
		
		 StringBuilder condition = new StringBuilder();
		 HashMap paraMap = new HashMap();
		 condition.append(" 1=1 ");
		 if(!"".equals(teamId)&&!"null".equals(teamId)){
		  condition.append(" and "+BOCustManagerTeamRelBean.S_TeamId + "  = :teamId ");
		  paraMap.put("teamId", teamId);
		 }
		 IBOCustManagerTeamRelValue[] values =   BOCustManagerTeamRelEngine.getBeans(condition.toString(),paraMap);
		 return values;
}

	public IBOCmCustManagerTeamValue[] queryCmCustManagerTeamByParentId(long teamId)
			throws Exception {
		
		 StringBuilder condition = new StringBuilder();
		 HashMap paraMap = new HashMap();
		 condition.append(" 1=1 ");
		 if(!"".equals(teamId)&&!"null".equals(teamId)){
		  condition.append(" and "+BOCustManagerTeamBean.S_ParentTeamId + "  = :teamId ");
		  paraMap.put("teamId", teamId);
		 }
		 IBOCmCustManagerTeamValue[] values =   BOCmCustManagerTeamEngine.getBeans(condition.toString(),paraMap);
		 return values;
}

	public IBOCmCustManagerTeamValue[] queryCmCustManagerTeamByTeamId(long teamId)
	throws Exception {

	 StringBuilder condition = new StringBuilder();
	 HashMap paraMap = new HashMap();
	 condition.append(" 1=1 ");
	 if(!"".equals(teamId)&&!"null".equals(teamId)){
	  condition.append(" and "+BOCustManagerTeamBean.S_TeamId + "  = :teamId ");
	  paraMap.put("teamId", teamId);
	 }
	 IBOCmCustManagerTeamValue[] values =   BOCmCustManagerTeamEngine.getBeans(condition.toString(),paraMap);
	 return values;
}
	
	public IBOCustManagerTeamRelValue[] queryCmCustManagerTeamRelByManagerId(long managerId) throws Exception {
		
		 StringBuilder condition = new StringBuilder();
		 HashMap paraMap = new HashMap();
		  condition.append(BOCustManagerTeamRelBean.S_ManagerId + "  = :managerId ");
		  paraMap.put("managerId", managerId);
		 IBOCustManagerTeamRelValue[] values =   BOCustManagerTeamRelEngine.getBeans(condition.toString(),paraMap);
		 return values;
	}
	
	public IBOCustManagerTeamRelValue[] queryCmCustManagerTeamRelByCdn(long teamId,long managerId) throws Exception
	{
		 StringBuilder condition = new StringBuilder(" 1=1 ");
		 HashMap paraMap = new HashMap();
		 if(managerId>0)
		 {
		  condition.append(" and "+BOCustManagerTeamRelBean.S_ManagerId + "  = :managerId ");
		  paraMap.put("managerId", managerId);
		 }
		 if(teamId>0)
		 {
		  condition.append(" and "+BOCustManagerTeamRelBean.S_TeamId + "  = :teamId ");
		  paraMap.put("teamId", teamId);
		 }
		 IBOCustManagerTeamRelValue[] values =   BOCustManagerTeamRelEngine.getBeans(condition.toString(),paraMap);
		 return values;
		
	}
}
