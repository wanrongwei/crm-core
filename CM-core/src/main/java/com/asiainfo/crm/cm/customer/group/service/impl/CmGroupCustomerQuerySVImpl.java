package com.asiainfo.crm.cm.customer.group.service.impl;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.ai.omframe.instance.ivalues.IInsUserOsStateValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmPartnerArchivesImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerQuerySV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupContactEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bo.GroupMemberBean;
import com.asiainfo.crm.cm.model.bo.GroupMemberEngine;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.asiainfo.crm.common.notes.tl.util.DateTimeUtil;
import com.asiainfo.crm.common.util.BsCommonDistrictUtil;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmGroupCustomerQuerySVImpl implements ICmGroupCustomerQuerySV {

	private static final int min = 1;
	private static final int max = 100;
//	private transient static Log log = LogFactory.getLog(CmGroupCustomerQuerySVImpl.class);
	
	public int qryGroupCustomerCountByCdn(String criteria) throws Exception
	{
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer dt = dts[0];
		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder("  ");
		Map queryParameter = new HashMap();
		sql.append("SELECT a.*,b.SEC_VOCATION,b.ENT_SCALE FROM cm_group_customer a,cmx_group_customer b WHERE a.cust_id = b.cust_id");
		
		//所属地市
		if(dt.get("CITY_ID")!= null && !"-1".equals(dt.get("CITY_ID")))
		{
			conditionSql.append(" and city_id = :cityId ");
			queryParameter.put("cityId", dt.get("CITY_ID"));
		}
		//所属区县
		if(dt.get("COUNTY_ID")!= null && !"-1".equals(dt.get("COUNTY_ID")))
		{
			conditionSql.append(" and county_id = :countyId ");
			queryParameter.put("countyId", dt.get("COUNTY_ID"));
		}
		//集团编码
		if(dt.get("CUST_SERVICE_ID")!=null && !"-1".equals(dt.get("CUST_SERVICE_ID")))
		{
			conditionSql.append(" and cust_service_id = :custServiceId ");
			queryParameter.put("custServiceId", dt.get("CUST_SERVICE_ID"));
		}
		//集团名称
		if(dt.get("CUST_NAME")!=null && !"-1".equals(dt.get("CUST_NAME")))
		{
			conditionSql.append(" and cust_name like :custName ");
			queryParameter.put("custName", dt.get("CUST_NAME")+"%");
		}
		//客户经理ID
		if(dt.get("OP_ID")!=null && !"-1".equals(dt.get("OP_ID")))
		{
			conditionSql.append(" and exists (select 1 from cm_group_manager g where t.cust_id = g.cust_id and g.manager_id = :managerId ) ");
			queryParameter.put("managerId", dt.get("OP_ID"));
		}
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(sql.toString(), conditionSql.toString(), queryParameter), queryParameter);
		return counts[0].getAsInt("CNT");
	}
	
	public DataContainer[] qryGroupCustomerByCdn(String criteria, int start, int end) throws Exception
	{
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer dt = dts[0];
		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder("  ");
		Map queryParameter = new HashMap();
		sql.append("SELECT a.*,b.SEC_VOCATION,b.ENT_SCALE FROM cm_group_customer a,cmx_group_customer b WHERE a.cust_id = b.cust_id");
		
		//所属地市
		if(dt.get("CITY_ID")!= null && !"-1".equals(dt.get("CITY_ID")))
		{
			conditionSql.append(" and city_id = :cityId ");
			queryParameter.put("cityId", dt.get("CITY_ID"));
		}
		//所属区县
		if(dt.get("COUNTY_ID")!= null && !"-1".equals( dt.get("COUNTY_ID")))
		{
			conditionSql.append(" and county_id = :countyId ");
			queryParameter.put("countyId", dt.get("COUNTY_ID"));
		}
		//集团编码
		if(dt.get("CUST_SERVICE_ID")!=null && !"-1".equals(dt.get("CUST_SERVICE_ID")))
		{
			conditionSql.append(" and cust_service_id = :custServiceId ");
			queryParameter.put("custServiceId", dt.get("CUST_SERVICE_ID"));
		}
		//集团名称
		if(dt.get("CUST_NAME")!=null && !"-1".equals(dt.get("CUST_NAME")))
		{
			conditionSql.append(" and cust_name like :custName ");
			queryParameter.put("custName", dt.get("CUST_NAME")+"%");
		}
		//客户经理ID
		if(dt.get("OP_ID")!=null && !"-1".equals(dt.get("OP_ID")))
		{
			conditionSql.append(" and exists (select 1 from cm_group_manager g where t.cust_id = g.cust_id and g.manager_id = :managerId ) ");
			queryParameter.put("managerId", dt.get("OP_ID"));
		}
		
		DataContainerInterface[] values = null;
		if (end > 0) 
		{
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), start, end, queryParameter), queryParameter);
		} 
		else 
		{
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, 
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), min, max, queryParameter), queryParameter);
		}
		
		DataContainer[] datas= null;
		
		if(null != values && values.length>0)
		{
			ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			ISec2CmSV iSec2CmSV = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			datas =	new DataContainer[values.length];
			IBOBsCommonDistrictValue cdv = null;
			for(int i=0;i<values.length;i++)
			{
				//DataContainer data= new DataContainer();
				//getMoreGroupBaseInfo(temp[i]);
				//temp[i].setDiaplayAttr("KEYPERSON_NUM", "00000", "1111");
				datas[i]=getMoreGroupBaseInfo((DataContainer)values[i],cnGroupSv,iSec2CmSV);
				//cdv = BsCommonDistrictUtil.getCommonDistrictByCode(values[i].getAsString("CITY_ID"),3);  //4 是区县，3是地市
				//datas[i].setDiaplayAttr("CITY_ID", cdv.getDistrictName(), null);
				cdv = BsCommonDistrictUtil.getCommonDistrictByCode(values[i].getAsString("COUNTY_ID"),4);  //4 是区县，3是地市
				if(cdv !=null)
					datas[i].set("COUNTY_ID", cdv.getDistrictName());
			}
		}
		else
		{
			//当查询不到数据时，一定要返回一个空的数据对象
			datas = new DataContainer[0];
		}
		return datas;
	}
	
	public DataContainer[] queryPartnerArchives(String criteria, int startNum,
			int endNum) throws Exception {
		DataContainer[] temp = ((AbstractCmPartnerArchivesImpl) CmServiceFactory
				.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryData(
				criteria, startNum, endNum);

		DataContainer[] datas= new DataContainer[temp.length];
		if(null != temp && temp.length>0)
		{
			ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
			ISec2CmSV iSec2CmSV = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			for(int i=0;i<temp.length;i++)
			{
				//DataContainer data= new DataContainer();
				
				//getMoreGroupBaseInfo(temp[i]);
				
				//temp[i].setDiaplayAttr("KEYPERSON_NUM", "00000", "1111");
				datas[i]=getMoreGroupBaseInfo(temp[i],cnGroupSv,iSec2CmSV);
				
			}
			
		}
		return datas;
	}

	/**
	 * 
	* @Function: CmGroupCustomerQuerySVImpl.java
	* @Description: 统计功能
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	 * @throws Exception 
	 * @throws RemoteException 
	* @date: Nov 1, 2012 7:43:06 PM 
	*
	* Modification History:
	* Nov 1, 2012         qiangkz          Version            Description
	 */
	private DataContainer getMoreGroupBaseInfo(DataContainer temp,ICmGroupCustomerSV cnGroupSv,ISec2CmSV iSec2CmSV) throws RemoteException, Exception 
	{
		DataContainer data= new DataContainer();
		//保持原有的数据
		data.copy(temp);
		/**
		 *关键人数量  KEYPERSON_NUM 
         *联系人数量    CPERSON_NUM
         *集团家属数量  FAMILY_NUM
         *网内成员数量  INLINE_NUM
         *网外成员数量 OUTLINE_NUM
		 */
		long contactCount =0L;//关键人数量
		long count1 =0L;//联系人数量
		long count2 =0L;//集团家属
		long count3 =0L;//网内成员
		long count4 =0L;//网外成员
		IBOCmGroupManagerValue gMgrRel=null;
		//查询主要客户经理  更改人：kangzk  更改原因：查询客户经理有调用接口错误导致前台无法显示
	    gMgrRel = cnGroupSv.queryGroupCustMgrRel(temp.getAsLong("CUST_ID"));
        if (CmCommonUtil.isNotEmptyObject(gMgrRel)) {
        	IQBOSecCustManagerValue boSecCustManager=iSec2CmSV.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
        	if (CmCommonUtil.isNotEmptyObject(boSecCustManager)) {
        		data.set("MANAGER_ID",boSecCustManager.getManagername());
			}else {
				data.set("MANAGER_ID", "");
			}
		}else {
			data.set("MANAGER_ID", "");
		}

        //modify by caiyu 修改查询逻辑，加快查询速度
        StringBuffer sqlSb = new StringBuffer();
        HashMap parameter = new HashMap();
        //注意这里用cont_id来存放数量，
        sqlSb.append("select CONT_TYPE,COUNT(1) as CONT_ID from cm_group_contact t where t.state='U' ");
        sqlSb.append(" and t.cust_id = :custId ");
        parameter.put("custId", temp.getAsLong("CUST_ID"));
        sqlSb.append(" group by CONT_TYPE ");
        BOCmGroupContactBean[] cgcBean = BOCmGroupContactEngine.getBeansFromSql(sqlSb.toString(), parameter);
        if(CmCommonUtil.isNotEmptyObject(cgcBean) && cgcBean.length>0)
        {
        	for(int x=0;x<cgcBean.length;x++)
        	{
        		if(cgcBean[x].getContType()==CmLnConstants.GroupContType.GROUP_CONTACT)
        		{
        			//联系人
        			count1 = cgcBean[x].getContId();
        		}
        		else if(cgcBean[x].getContType()==CmLnConstants.GroupContType.GROUP_KEY_PERSON)
        		{
        			//关键人
        			contactCount = cgcBean[x].getContId();
        		}
        		else if(cgcBean[x].getContType()==CmLnConstants.GroupContType.GROUP_FAMILY)
        		{
        			//集团家属
        			count2 = cgcBean[x].getContId();
        		}
        	}
        }
        
        StringBuffer sqlM = new StringBuffer();
        HashMap parameterM = new HashMap();
        //注意这里用cust_rel_id来存放成员数量
        sqlM.append("select MEMBER_TYPE,COUNT(1) as CUST_REL_ID from cm_group_member t where t.state='U' ");
        sqlM.append(" and t.cust_id = :custId ");
        parameterM.put("custId", temp.getAsLong("CUST_ID"));
        sqlM.append(" group by MEMBER_TYPE ");
        GroupMemberBean[] gmBean = GroupMemberEngine.getBeansFromSql(sqlM.toString(), parameterM);
        if(CmCommonUtil.isNotEmptyObject(gmBean) && gmBean.length>0)
        {
        	for(int y=0;y<gmBean.length;y++)
        	{
        		if(gmBean[y].getMemberType() == CmLnConstants.GroupContType.GROUP_MEMBER_INNER)
        		{
        			//网内成员
        			count3 = gmBean[y].getCustRelId();
        		}
        		else if(gmBean[y].getMemberType() == CmLnConstants.GroupContType.GROUP_MEMBER_OUTTER)
        		{
        			//网外成员
        			count4 = gmBean[y].getCustRelId();
        		}
        	}
        }
        
//        //查询联系人关键人数量 
//	    contactCount = CmServiceFactory.getContactSV().queryCustContactCountByCustId(temp.getAsLong("CUST_ID"),CmConstants.RecordState.USE,CmLnConstants.GroupContType.GROUP_KEY_PERSON+"");
//		//联系人数量
//	    count1 = CmServiceFactory.getContactSV().queryCustContactCountByCustId(temp.getAsLong("CUST_ID"),CmConstants.RecordState.USE,CmLnConstants.GroupContType.GROUP_CONTACT+"");
//		ICmGroupMemberSV icmgrp = (ICmGroupMemberSV) ServiceFactory.getService(ICmGroupMemberSV.class);
//		DataContainer dc = new DataContainer();
//		dc.set(IBOCmGroupMemberValue.S_CustId, temp.getAsLong("CUST_ID"));
//		//1 网内成员
//		dc.set(IBOCmGroupMemberValue.S_MemberType,1);
//        count3 = icmgrp.getGroupMemberValuesCount(dc);
//        //2 网外成员
//        dc.set(IBOCmGroupMemberValue.S_MemberType,2);
//        count4 = icmgrp.getGroupMemberValuesCount(dc);
		
		data.set("KEYPERSON_NUM", contactCount);
		data.set("CPERSON_NUM", count1);
		data.set("FAMILY_NUM",count2);
		data.set("INLINE_NUM", count3);
		data.set("OUTLINE_NUM", count4);
		return data;
	}
	/**
	 * 
	* @Function: CmGroupCustomerQuerySVImpl.java
	* @Description:查找入网时间和集团经理
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 10, 2012 2:47:25 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 10, 2012     suntao6           v1.0.0              修改原因
	 */
	private DataContainer getMoreGroupMemberInfo(DataContainer temp,ICmTeamInvokeSV sv) throws RemoteException, Exception 
	{
		DataContainer data= new DataContainer();
		//保持原有的数据
		data.copy(temp);
		int memberType = temp.getAsInt("MEMBER_TYPE");
//		String custId = temp.getAsString("CUST_ID");
		if(memberType == 1)
		{
			String BillId = String.valueOf(temp.getAsLong("BILL_ID"));
			//CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID,BillId);
			//根据手机号码查找用户入网时间
			IQUserBaseInfoValue insUserValue = sv.getUserBaseInfoByBillId(BillId);
			if(null != insUserValue)
			{
				Timestamp oprTime = insUserValue.getCreateDate();	
				String date = DateTimeUtil.getYYYYMMDDHHMMSS(oprTime);
				data.set("OPR_TIME", date);// 入网时间	
			}	
		}
		return data;
	}

	public int queryPartnerArchivesCount(String criteria) throws Exception {
		return ((AbstractCmPartnerArchivesImpl) CmServiceFactory
				.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryCount(criteria);
	}
	
	public int queryGMBCountbyCdn(String criteria) throws Exception
	{
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer dt = dts[0];
		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder("  ");
		Map queryParameter = new HashMap();
		sql.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(com.asiainfo.crm.cm.common.bo.QBOCmGroupMemberBean.class).getMapingEnty());
		
		//所属地市
		if(dt.get("CITY_ID")!= null && !"-1".equals(dt.get("CITY_ID")))
		{
			conditionSql.append(" and city_id = :cityId ");
			queryParameter.put("cityId", dt.get("CITY_ID"));
		}
		//所属区县
		if(dt.get("COUNTY_ID")!= null && !"-1".equals(dt.get("COUNTY_ID")))
		{
			conditionSql.append(" and county_id = :countyId ");
			queryParameter.put("countyId", dt.get("COUNTY_ID"));
		}
		//集团编码
		if(dt.get("CUST_SERVICE_ID")!=null && !"-1".equals(dt.get("CUST_SERVICE_ID")))
		{
			conditionSql.append(" and cust_service_id = :custServiceId ");
			queryParameter.put("custServiceId", dt.get("CUST_SERVICE_ID"));
		}
		//集团名称
		if(dt.get("CUST_NAME")!=null && !"-1".equals(dt.get("CUST_NAME")))
		{
			conditionSql.append(" and cust_name like :custName ");
			queryParameter.put("custName", dt.get("CUST_NAME")+"%");
		}
		//手机号码
		if(dt.get("BILL_ID")!=null && !"-1".equals(dt.get("BILL_ID")))
		{
			conditionSql.append(" and bill_id = :billId ");
			queryParameter.put("billId", dt.get("BILL_ID"));
		}
		
		//客户经理ID
		if(dt.get("OP_ID")!=null && !"-1".equals(dt.get("OP_ID")))
		{
			conditionSql.append(" and exists (select 1 from cm_group_manager m where t.cust_id = m.cust_id and m.manager_id = :managerId ) ");
			queryParameter.put("managerId", dt.get("OP_ID"));
		}
		DataContainerInterface[] counts = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryCount(sql.toString(), conditionSql.toString(), queryParameter), queryParameter);
		return counts[0].getAsInt("CNT");
	}
	
	public DataContainer[] queryGMBbyCdn(String criteria,int startNum,int endNum) throws Exception
	{
		DataContainer[] dts = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer dt = dts[0];
		StringBuilder sql = new StringBuilder("");
		StringBuilder conditionSql = new StringBuilder("  ");
		Map queryParameter = new HashMap();
		sql.append(ServiceManager.getObjectTypeFactory().getObjectTypeByClass(com.asiainfo.crm.cm.common.bo.QBOCmGroupMemberBean.class).getMapingEnty());
		//所属地市
		if(dt.get("CITY_ID")!= null && !"-1".equals(dt.get("CITY_ID")))
		{
			conditionSql.append(" and city_id = :cityId ");
			queryParameter.put("cityId", dt.get("CITY_ID"));
		}
		//所属区县
		if(dt.get("COUNTY_ID")!= null && !"-1".equals(dt.get("COUNTY_ID")))
		{
			conditionSql.append(" and county_id = :countyId ");
			queryParameter.put("countyId", dt.get("COUNTY_ID"));
		}
		//集团编码
		if(dt.get("CUST_SERVICE_ID")!=null && !"-1".equals(dt.get("CUST_SERVICE_ID")))
		{
			conditionSql.append(" and cust_service_id = :custServiceId ");
			queryParameter.put("custServiceId", dt.get("CUST_SERVICE_ID"));
		}
		//集团名称
		if(dt.get("CUST_NAME")!=null && !"-1".equals(dt.get("CUST_NAME")))
		{
			conditionSql.append(" and cust_name like :custName ");
			queryParameter.put("custName", dt.get("CUST_NAME")+"%");
		}
		//手机号码
		if(dt.get("BILL_ID")!=null && !"-1".equals(dt.get("BILL_ID")))
		{
			conditionSql.append(" and bill_id = :billId ");
			queryParameter.put("billId", dt.get("BILL_ID"));
		}
		
		//客户经理ID
		if(dt.get("OP_ID")!=null && !"-1".equals(dt.get("OP_ID")))
		{
			conditionSql.append(" and exists (select 1 from cm_group_manager m where t.cust_id = m.cust_id and m.manager_id = :managerId ) ");
			queryParameter.put("managerId", dt.get("OP_ID"));
		}
		DataContainerInterface[] values = null;
		if (endNum > 0) 
		{
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(com.asiainfo.crm.cm.common.bo.QBOCmGroupMemberBean.class,
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), startNum, endNum, queryParameter), queryParameter);
		} 
		else 
		{
			values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(com.asiainfo.crm.cm.common.bo.QBOCmGroupMemberBean.class, 
					CmLnCommonUtil.getQueryResult(sql.toString(), conditionSql.toString(), min, max, queryParameter), queryParameter);
		}
		
		DataContainer[] datas= null;
		
		if(null != values && values.length>0)
		{
			long custId = -1L;
			String managerName = "";
			ICmTeamInvokeSV sv = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			IBOBsCommonDistrictValue cdv = null;
			datas = new DataContainer[values.length];
			for(int i=0;i<values.length;i++)
			{
				datas[i] = new DataContainer();
				datas[i]=getMoreGroupMemberInfo((DataContainer)values[i],sv);
				//cdv = BsCommonDistrictUtil.getCommonDistrictByCode(values[i].getAsString("CITY_ID"),3);  //4 是区县，3是地市
				//datas[i].set("CITY_ID", cdv.getDistrictName());
				cdv = BsCommonDistrictUtil.getCommonDistrictByCode(values[i].getAsString("COUNTY_ID"),4);  //4 是区县，3是地市
				datas[i].set("COUNTY_ID", cdv.getDistrictName());
//				datas[i].set("CITY_ID", cdv.getDistrictName());
				//datas[i].set("COUNTY_ID", cdv.getDistrictName());
				if(i==0)
				{
					//第一次调用接口获取客户经理信息
					custId = values[i].getAsLong("CUST_ID");
					managerName = getGroupManagerNameByCustId(""+custId);
					if(!"".equals(managerName))
					{
						datas[i].set("MANAGER_ID", managerName);// 设置客户经理
					}
				}
				else
				{
					//判断本记录的custid和上一条记录的custid是否相同
					if(custId == values[i].getAsLong("CUST_ID"))
					{
						datas[i].set("MANAGER_ID", managerName);
					}
					else
					{
						custId = values[i].getAsLong("CUST_ID");
						managerName = getGroupManagerNameByCustId(""+custId);
						if(!"".equals(managerName))
						{
							datas[i].set("MANAGER_ID", managerName);// 设置客户经理
						}
					}
				}
				
			}
			
//			ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
//			ISec2CmSV iSec2CmSV = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
//			datas =	new DataContainer[values.length];
//			for(int i=0;i<values.length;i++)
//			{
//				//DataContainer data= new DataContainer();
//				
//				//getMoreGroupBaseInfo(temp[i]);
//				
//				//temp[i].setDiaplayAttr("KEYPERSON_NUM", "00000", "1111");
//				datas[i]=getMoreGroupBaseInfo((DataContainer)values[i],cnGroupSv,iSec2CmSV);
//			}
		}
		else
		{
			//当查询不到数据时，一定要返回一个空的数据对象
			datas = new DataContainer[0];
		}
		return datas;
	}
	

	public DataContainer[] queryGroupMemberInfo(String criteria, int startNum,
			int endNum) throws Exception {
			DataContainer[] temp = ((AbstractCmPartnerArchivesImpl) CmServiceFactory
					.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryData(
					criteria, startNum, endNum);
			
			DataContainer[] datas= new DataContainer[temp.length];
			if(null != temp && temp.length>0)
			{
				long custId = -1L;
				String managerName = "";
				ICmTeamInvokeSV sv = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
				for(int i=0;i<temp.length;i++)
				{
					datas[i]=getMoreGroupMemberInfo(temp[i],sv);
					if(i==0)
					{
						//第一次调用接口获取客户经理信息
						custId = temp[i].getAsLong("CUST_ID");
						managerName = getGroupManagerNameByCustId(""+custId);
						if(!"".equals(managerName))
						{
							datas[i].set("MANAGER_ID", managerName);// 设置客户经理
						}
					}
					else
					{
						//判断本记录的custid和上一条记录的custid是否相同
						if(custId == temp[i].getAsLong("CUST_ID"))
						{
							datas[i].set("MANAGER_ID", managerName);
						}
						else
						{
							custId = temp[i].getAsLong("CUST_ID");
							managerName = getGroupManagerNameByCustId(""+custId);
							if(!"".equals(managerName))
							{
								datas[i].set("MANAGER_ID", managerName);// 设置客户经理
							}
						}
					}
					
				}
			}
			return datas;

}
	
	public int queryGroupMemberInfoCount(String criteria) throws Exception {
		return ((AbstractCmPartnerArchivesImpl) CmServiceFactory
				.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryCount(criteria);
	}
	/**
	 * 
	* @Function: CmGroupCustomerQuerySVImpl.java
	* @Description: 根据客户编号查找客户经理的名称
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	 * @throws Exception 
	 * @throws RemoteException 
	 * @throws NumberFormatException 
	* @date: Nov 10, 2012 3:28:22 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 10, 2012     suntao6           v1.0.0              修改原因
	 */
	private String getGroupManagerNameByCustId(String custId) throws NumberFormatException, RemoteException, Exception{
		ICmGroupCustomerSV cnGroupSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		String managerName = "";
		// 查询客户经理信息
		IBOCmGroupManagerValue gMgrRel = cnGroupSv.queryGroupCustMgrRel(Long.parseLong(custId));
		if (gMgrRel != null) {
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			IQBOSecCustManagerValue secStaff = iseCm.getEffectAmInfo(gMgrRel.getManagerId(), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
			if (CmCommonUtil.isNotEmptyObject(secStaff)) {
				managerName = secStaff.getManagername();
			}
		}
		return managerName;
	}

	public DataContainer[] queryStopGroupMemberInfo(String criteria,int startNum, int endNum) throws Exception 
	{

		DataContainer[] temp = ((AbstractCmPartnerArchivesImpl) CmServiceFactory
				.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryData(criteria, -1, -1);
		
		List<DataContainer> datas = new ArrayList<DataContainer>();
		if(null != temp && temp.length>0)
		{
			ICmTeamInvokeSV sv = (ICmTeamInvokeSV) ServiceFactory.getCrossCenterService(ICmTeamInvokeSV.class);
			ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
			IInsUserOsStateValue value = null;
//			long custId = -1L;
//			String managerName = "";
			for(int i=0;i<temp.length;i++)
			{
				String billId = temp[i].getAsString("BILL_ID");
				int memberType = temp[i].getAsInt("MEMBER_TYPE");
				if (memberType == 1) 
				{
					CenterFactory.setCenterInfoByTypeAndValue(CenterConst.BILL_ID, billId);
					value = crmFSV.getInstUserOsStateValueByBillId(billId);
					if(value!=null){//如果存在停开机实例
						String str = sv.getOsStatusAndTime(value.getOsStatus(), value);//获取用户实例的停机状态和停机时间字符串	
						if(value.getOsStatus().indexOf("1") > 0)
						{//标识1 则为停机状态
							String da[] = str.split(" ");	
							int count = da.length;
							for (int j = 0; j < count; j++) 
							{
								if(da[j].indexOf("(")>=0)
								{
									String type = da[j].substring(0,da[j].indexOf("("));
									String time = da[j].substring(da[j].indexOf("(")+1, da[j].indexOf(")"));
									temp[i].initProperty("STOP_DATE",time);
									temp[i].initProperty("STOP_TYPE",type);
								}
								else
								{
									temp[i].initProperty("STOP_TYPE",da[j]);
								}
								//getMoreStopGroupMemberInfo(temp[i])--根据手机号码去查客户经理的方法
								datas.add(getMoreStopGroupMemberInfo(temp[i]));
							}
						}
					}
				}
				
//				if(i==0)
//				{
//					custId = temp[i].getAsLong("CUST_ID");
//					managerName = getGroupManagerNameByCustId(""+custId);
//					if(managerName != "")
//					{
//						temp[i].initProperty("MANAGER_ID", managerName);// 设置客户经理
//					}
//				}
//				else
//				{
//					if(custId == temp[i].getAsLong("CUST_ID"))
//					{
//						temp[i].initProperty("MANAGER_ID", managerName);
//					}
//					else
//					{
//						custId = temp[i].getAsLong("CUST_ID");
//						managerName = getGroupManagerNameByCustId(""+custId);
//						if(!"".equals(managerName))
//						{
//							temp[i].initProperty("MANAGER_ID", managerName);// 设置客户经理
//						}
//					}
//					
//				}
				
//				IInsUserOsStateValue value = sv.getUserOutState(billId,memberType);//根据billId,成员类型（网外/网内）查找停开机实例对象
				//datas.add(getMoreStopGroupMemberInfo(temp[i]));
			}
		}
		return (DataContainer[])datas.toArray(new DataContainer[0]);
}
	/**
	 * 
	* @Function: CmGroupCustomerQuerySVImpl.java
	* @Description:补充停开机信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 10, 2012 5:08:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 10, 2012     suntao6           v1.0.0              修改原因
	 */
	private DataContainer getMoreStopGroupMemberInfo(DataContainer temp) throws RemoteException, Exception 
	{
		DataContainer data= new DataContainer();
		//保持原有的数据
		String type = temp.getAsString("STOP_TYPE");
		String time = temp.getAsString("STOP_DATE");
		data.copy(temp);
		data.initProperty("STOP_DATE",time);
		data.initProperty("STOP_TYPE",type);
		int memberType = temp.getAsInt("MEMBER_TYPE");
		String custId = temp.getAsString("CUST_ID");
		if(memberType == 1){
//			String BillId = String.valueOf(temp.getAsLong("BILL_ID"));
//			ICmTeamInvokeSV sv = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			//根据CUST_ID查找客户经理
			String managerName = getGroupManagerNameByCustId(custId);
			if(!"".equals(managerName)){
				data.set("MANAGER_ID", managerName);// 设置客户经理
			}
		}
		return data;
	}

	public int queryStopGroupMemberInfoCount(String criteria) throws Exception {

		DataContainer[] temp = ((AbstractCmPartnerArchivesImpl) CmServiceFactory
				.getBusiMode(AbstractCmPartnerArchivesImpl.class)).queryData(
				criteria, -1, -1);
		List datas = new ArrayList();
		if(null != temp && temp.length>0)
		{
			for(int i=0;i<temp.length;i++)
			{
			String billId = temp[i].getAsString("BILL_ID");
			int memberType = temp[i].getAsInt("MEMBER_TYPE");
			ICmTeamInvokeSV sv = (ICmTeamInvokeSV) ServiceFactory.getCrossCenterService(ICmTeamInvokeSV.class);
			IInsUserOsStateValue value = sv.getUserOutState(billId,memberType);//根据billId,成员类型（网外/网内）查找停开机实例对象
			if(value!=null){//如果存在停开机实例
				String str = sv.getOsStatusAndTime(value.getOsStatus(), value);//获取用户实例的停机状态和停机时间字符串	
				if(value.getOsStatus().indexOf("1")>=0){//前30位存在标识1 则为停机状态
					String da[] = str.split(" ");	
					int count = da.length;
					for (int j = 0; j < count; j++) {
						if(da[j].indexOf("(")>=0){
							String type = da[j].substring(0,da[j].indexOf("("));
							String time = da[j].substring(da[j].indexOf("(")+1, da[j].indexOf(")"));
							temp[i].initProperty("STOP_DATE",time);
							temp[i].initProperty("STOP_TYPE",type);
						}else{
							temp[i].initProperty("STOP_TYPE",da[j]);
						  }	
						datas.add(getMoreStopGroupMemberInfo(temp[i]));
						}
					}
				}
				
			}
		}
		return datas.size();

	}
}
