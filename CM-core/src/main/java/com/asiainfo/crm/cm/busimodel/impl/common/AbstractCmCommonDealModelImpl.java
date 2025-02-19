package com.asiainfo.crm.cm.busimodel.impl.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCustMerchantBean;
import com.asiainfo.crm.cm.common.bo.BOCmGroupManagerHBean;
import com.asiainfo.crm.cm.common.bo.BOGroupArchivesBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustMerchantValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupManagerHValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

public class AbstractCmCommonDealModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel 
{

	private transient static Log log = LogFactory.getLog(AbstractCmCommonDealModelImpl.class);
	
	public final void saveData(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			// 设置主键
			//values[i].setServiceId(CmCommonUtil.getNewSequence(BOCmClubServiceBean.class));
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception 
	{
		if(log.isDebugEnabled())
			log.debug("\nqueryXml is:["+criteria+"]\n");
		
		return queryData(ParamUtil.parseXmlCriteria(criteria), startNum, endNum);
	}

	public final DataContainer[] queryData(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception 
	{
		// 构造查询条件
		return queryData(conditionDCs,null, startNum, endNum);
	}
	
	public final DataContainer[] queryData(DataContainer[] conditionDCs,String[] likes, int startNum, int endNum) throws Exception 
	{
		Parameter parameter = buildQueryCondition(conditionDCs,likes);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(values)) {
			return new DataContainer[0];
		}
		return (DataContainer[]) values;
	}

	public int queryCount(String criteria) throws Exception 
	{
		if(log.isDebugEnabled())
			log.debug("\nqueryXml is:["+criteria+"]\n");
		
		return queryCount(ParamUtil.parseXmlCriteria(criteria));
	}
	
	public final int queryCount(DataContainer[] conditionDCs) throws Exception 
	{
		return queryCount(conditionDCs,null);
	}
	
	public final int queryCount(DataContainer[] conditionDCs,String[] likes) throws Exception 
	{
		Parameter parameter = buildQueryCondition(conditionDCs,likes);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	
	}


	public Parameter buildQueryCondition(DataContainer[] conditionDCs,String[] likes) throws Exception 
	{
		Parameter parameter = ParamUtil.buildParameter(conditionDCs, conditionDCs[0].getClass(),likes);
		return parameter;
	}
	
	public DataContainerInterface[] queryData(String[] cols,DataContainer[] criteria, int startNum, int endNum)
		throws Exception 
	{
	    return null;
	}
	public IBOCmCustMerchantValue queryMerchantInfoById(String custMerchantId, int startNum, int endNum) throws Exception {
		BOCmCustMerchantBean bean = new BOCmCustMerchantBean();
		bean.setMerchantId(custMerchantId);
	//	bean.setRegionId(CenterUtil.getRegionIdByAcctId(acctId));
		Parameter parameter = ParamUtil.buildParameter(bean, BOCmCustMerchantBean.class);
		// 记录业务日志
	//	CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		DataContainerInterface[] dcs = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter(), startNum,
				endNum);
		BOCmCustMerchantBean bean1 = null;
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			bean1 = new BOCmCustMerchantBean();
			bean1.copy(dcs[0]);
		}
		// 查询完成之后的封装
//		afterQueryAccountById(accountBean);
		return bean1;
	}
	/**
	 * @Description 获取集团客户分配轨迹查询记录
	 * @author lijh
	 */
	public DataContainer[] queryCustManagerH(String custServiceId, String startDate, String endDate, int startNum, int endNum) throws Exception 
	{   
		DataContainer queryDC=new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		//根据集团编码查找集团客户信息
		ICustomerValue[] groupValues =CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
		if(groupValues ==null || groupValues.length<=0){
			throw new Exception("According to the group number :"+custServiceId+"The group did not find the corresponding customer information !");
		}
		long custId=groupValues[0].getCustId();  
		StringBuilder sql =new StringBuilder("");
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
        TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_MANAGER_H", IBOCmGroupManagerHValue.S_DoneDate, startDate.substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_GROUP_MANAGER_H} T)  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmGroupManagerHValue.S_DoneDate).append(" >=DATE_FORMAT('"+startDate.substring(1, 10)+"' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmGroupManagerHValue.S_DoneDate).append(" < ").append("DATE_ADD(DATE_FORMAT('"+endDate.substring(1, 10)+"' ,'%Y-%m-%d'),interval 1 day)");
		
		if(custId>0){
		 sql.append(" and ").append(IBOCmGroupManagerHValue.S_CustId).append("= :custId");
		 parameter.put("custId", custId);
		}
		
		if(startNum >=0 && endNum > 0)
		{
			sql.append(" LIMIT :startNum,:endNum");
		}
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);
		
		ISec2CmSV isCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		DataContainerInterface[] returnValues=CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupManagerHBean.class, SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
		DataContainer[] dc=(DataContainer[]) returnValues;
		int len = dc.length;
		for (int i = 0; i < len; i++) {
			IQBOSecCustManagerValue bosec = isCm.getEffectAmInfo(dc[i].getAsLong("MANAGER_ID"), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
			if (CmCommonUtil.isNotEmptyObject(bosec)) {
				dc[i].initProperty("MANAGER_NAME", bosec.getManagername());
			}
		}
		return dc;
	}
	/**
	 * @Description 获取集团客户分配轨迹查询记录条数
	 * @author lijh
	 */
	public int queryCustManagerHCount(String custServiceId, String startDate, String endDate) throws Exception {
		DataContainer queryDC=new DataContainer();
		queryDC.set(ICustomerValue.S_CustServiceId, custServiceId);
		queryDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		//根据集团编码查找集团客户信息
	    ICustomerValue[] groupValues =CmServiceFactory.getCustomerSV().queryCustomers(queryDC, -1, -1);
		if(groupValues ==null || groupValues.length<=0){
			throw new Exception("According to the group number :"+custServiceId+"The group did not find the corresponding customer information !");
		}
		long custId=groupValues[0].getCustId();  
		StringBuilder sql =new StringBuilder("");
		HashMap<Object,Object> parameter =new HashMap<Object,Object>();
        TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_MANAGER_H", IBOCmGroupManagerHValue.S_DoneDate, startDate.substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_GROUP_MANAGER_H} T)  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmGroupManagerHValue.S_DoneDate).append(" >=DATE_FORMAT('"+startDate.substring(1, 10)+"' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmGroupManagerHValue.S_DoneDate).append(" < ").append("DATE_ADD(DATE_FORMAT('"+endDate.substring(1, 10)+"' ,'%Y-%m-%d'),interval 1 day)");
		
		if(custId>0){
		 sql.append(" and ").append(IBOCmGroupManagerHValue.S_CustId).append("= :custId");
		 parameter.put("custId", custId);
		}

		ISec2CmSV isCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
		DataContainerInterface[] returnValues=CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupManagerHBean.class, SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
		DataContainer[] dc=(DataContainer[]) returnValues;
		int len = dc.length;
		for (int i = 0; i < len; i++) {
			IQBOSecCustManagerValue bosec = isCm.getEffectAmInfo(dc[i].getAsLong("MANAGER_ID"), CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
			if (CmCommonUtil.isNotEmptyObject(bosec)) {
				dc[i].initProperty("MANAGER_NAME", bosec.getManagername());
			}
		}
		return len;
	}
}
