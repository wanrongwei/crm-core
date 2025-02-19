package com.asiainfo.crm.cm.customer.group.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.customer.group.bo.BOCmGroupCustMemberHBean;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMemberHValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberHSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;

public class CmGroupMemberHSVImpl implements ICmGroupMemberHSV 
{

	public int queryDataCount(String criteria) throws Exception 
	{
		DataContainer[] dcs =ParamUtil.parseXmlCriteria(criteria);
		DataContainer dc =dcs[0];
		
		ICustomerValue customerValue=null;
		
		if(dc.hasProperty("CUST_SERVICE_ID"))
		{
			 customerValue= CmServiceFactory.getCustomerSV()
				.queryCustomerByServiceId(dc.getAsString("CUST_SERVICE_ID"), CmConstants.CustomerType.GROUP);
			if(customerValue ==null)
				return 0;
		}
		
		HashMap<Object,Object> parameter = new HashMap<Object,Object>();
		
		StringBuilder sb = new StringBuilder(" 1=1");
		
		if(dc.hasProperty("START_DATE"))
		{
			parameter.put("StartDate", dc.get("START_DATE"));
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_DoneDate).append(">=to_date( :StartDate ,'YYYY-MM-DD')");
		}
		
		if(dc.hasProperty("END_DATE"))
		{
			parameter.put("EndDate", dc.get("END_DATE"));
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_DoneDate).append("<=to_date( :EndDate ,'YYYY-MM-DD')+1");
		}
		
		if(dc.hasProperty("BILL_ID"))
		{
			parameter.put("BillId", dc.get("BILL_ID"));
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_BillId).append("= :BillId ");
		}
		
		if(customerValue !=null)
		{
			parameter.put("CustId", customerValue.getCustId());
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_CustId).append("= :CustId ");
		}
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd") ;
		parameter.put(IBOCmGroupCustMemberHValue.S_DoneDate, sdf.parse(dc.getAsString("END_DATE")));
		
		
		
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmGroupCustMemberHBean.class, sb.toString(), parameter);
		
		//String[] cycle = CmCommonUtil.getCycleYYMM(startDate, endDate);
		/*TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_MEMBER_H", IBOCmGroupCustMemberHValue.S_DoneDate, condition.getAsString("START_DATE").substring(0, 4));
		tableVar.add("CMX_GROUP_MEMBER_H", IBOCmGroupCustMemberHValue.S_DoneDate, condition.getAsString("START_DATE").substring(0, 4));
		
		sql.append("select count(*) as CNT from (").append("select t.*,rownum rownum_ from (").append(BOCmGroupCustMemberHBean.getObjectTypeStatic().getMapingEnty()).append(") t").append(" where ")
			.append(IBOCmGroupCustMemberHValue.S_CustId).append("= :Custid ")
			.append("and ").append(IBOCmGroupCustMemberHValue.S_DoneDate).append(">=to_date( :StartDate ,'YYYY-MM-DD')")
			.append("and ").append(IBOCmGroupCustMemberHValue.S_DoneDate).append("<=to_date( :EndDate ,'YYYY-MM-DD')")
			.append(")");
		
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
		parameter.put("Custid", customerValue.getCustId());
		parameter.put("StartDate", condition.getAsString("START_DATE"));
		parameter.put("EndDate", condition.getAsString("END_DATE"));
		
		DataContainerInterface[] returnValues=CmInnerServiceFactory.getCommonInnerSV()
			.getBeansFromSql(DataContainer.class, SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);*/
		
		
	}

	public DataContainerInterface[] queryData(String criteria, int startNum,int endNum) throws Exception 
	{
		DataContainer[] dcs =ParamUtil.parseXmlCriteria(criteria);
		DataContainer dc =dcs[0];
		
		ICustomerValue customerValue=null;
			
		if(dc.hasProperty("CUST_SERVICE_ID"))
		{
			 customerValue= CmServiceFactory.getCustomerSV()
				.queryCustomerByServiceId(dc.getAsString("CUST_SERVICE_ID"), CmConstants.CustomerType.GROUP);
			if(customerValue ==null)
				return new DataContainer[0];
		}
		
		HashMap<Object,Object> parameter = new HashMap<Object,Object>();
		
		StringBuilder sb = new StringBuilder(" 1=1");
		
		if(dc.hasProperty("START_DATE"))
		{
			parameter.put("StartDate", dc.get("START_DATE"));
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_DoneDate).append(">=to_date( :StartDate ,'YYYY-MM-DD')");
		}
		
		if(dc.hasProperty("END_DATE"))
		{
			parameter.put("EndDate", dc.get("END_DATE"));
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_DoneDate).append("<=to_date( :EndDate ,'YYYY-MM-DD')+1");
		}
		
		if(dc.hasProperty("BILL_ID"))
		{
			parameter.put("BillId", dc.get("BILL_ID"));
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_BillId).append("= :BillId ");
		}
		
		if(customerValue !=null)
		{
			parameter.put("CustId", customerValue.getCustId());
			sb.append(" and ").append(IBOCmGroupCustMemberHValue.S_CustId).append("= :CustId ");
		}
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd") ;
		parameter.put(IBOCmGroupCustMemberHValue.S_DoneDate, sdf.parse(dc.getAsString("END_DATE")));
		
		DataContainerInterface[] returnValues=CmInnerServiceFactory
			.getCommonInnerSV().getBeans(BOCmGroupCustMemberHBean.class, sb.toString(), parameter, startNum, endNum);
		
		if(customerValue!=null)
			for(DataContainerInterface value:returnValues)
			{
				value.initProperty("CUST_SERVICE_ID", customerValue.getCustServiceId());
				value.initProperty("CUST_NAME", customerValue.getCustName());
			}
		
		return returnValues;
	}

	public void saveData(DataContainer[] values) throws Exception 
	{	}

}
