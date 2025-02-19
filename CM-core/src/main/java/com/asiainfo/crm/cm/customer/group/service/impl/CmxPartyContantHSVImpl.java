package com.asiainfo.crm.cm.customer.group.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmxPartyContantHSV;
import com.asiainfo.crm.cm.inner.contact.bo.BOCmGroupContactHBean;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmGroupContactHValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public class CmxPartyContantHSVImpl implements ICmxPartyContantHSV {

	/*
	 * public int queryDataCount(String criteria) throws Exception { DataContainer[] dcs
	 * =ParamUtil.parseXmlCriteria(criteria); DataContainer condition =dcs[0]; ICustomerValue customerValue=null;
	 * StringBuilder sql =new StringBuilder(""); if(condition.getAsString("CUST_SERVICE_ID")!=null &&
	 * !"".equals(condition.getAsString("CUST_SERVICE_ID"))) { customerValue=
	 * CmServiceFactory.getCustomerSV().queryCustomerByCustId(condition.getAsLong("CUST_SERVICE_ID")); if(customerValue
	 * ==null) return 0; } TableVars tableVar = new TableVars(); tableVar.add("CM_GROUP_CONTACT_H",
	 * IBOCmCmxPartyContactHValue.S_DoneDate, condition.getAsString("START_DATE").substring(0, 4)); sql.append("select
	 * count(*) as CNT from (").append("select t.*,rownum rownum_ from (").append("SELECT a.*,b.cust_id FROM
	 * {CM_GROUP_CONTACT_H} a ,cm_group_contact b WHERE a.cont_id =b.cont_id").append(") t").append(" where 1=1 ");
	 * if(condition.getAsString("MEMBER_TYPE")!=null && !"".equals(condition.getAsString("MEMBER_TYPE")))
	 * sql.append("and ").append(IBOCmCmxPartyContactHValue.S_MemberType).append("= :MemberType "); sql.append("and
	 * ").append(ICustomerValue.S_CustId).append("= :Custid ") .append("and
	 * ").append(IBOCmCmxPartyContactHValue.S_DoneDate).append(">=to_date( :StartDate ,'YYYY-MM-DD')") .append("and
	 * ").append(IBOCmCmxPartyContactHValue.S_DoneDate).append("<=to_date( :EndDate ,'YYYY-MM-DD')") .append(")");
	 * HashMap<Object,Object> parameter =new HashMap<Object,Object>(); if(condition.getAsString("MEMBER_TYPE")!=null &&
	 * !"".equals(condition.getAsString("MEMBER_TYPE"))) parameter.put("MemberType",
	 * condition.getAsString("MEMBER_TYPE")); parameter.put("Custid", customerValue.getCustId());
	 * parameter.put("StartDate", condition.getAsString("START_DATE")); parameter.put("EndDate",
	 * condition.getAsString("END_DATE")); DataContainerInterface[]
	 * returnValues=CmInnerServiceFactory.getCommonInnerSV() .getBeansFromSql(DataContainer.class,
	 * SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
	 * System.out.println("\n\nreturnValues[0].getAsInt=:"+returnValues[0].getAsInt("CNT")+"\n\n"); return
	 * returnValues[0].getAsInt("CNT"); }
	 */
	/*
	 * public DataContainerInterface[] queryData(String criteria, int startNum,int endNum) throws Exception {
	 * DataContainer[] dcs =ParamUtil.parseXmlCriteria(criteria); DataContainer condition =dcs[0]; ICustomerValue
	 * customerValue=null; StringBuilder sql =new StringBuilder(""); if(condition.getAsString("CUST_SERVICE_ID")!=null
	 * &&
	 * !"".equals(condition.getAsString("CUST_SERVICE_ID"))) { customerValue=
	 * CmServiceFactory.getCustomerSV().queryCustomerByCustId(condition.getAsLong("CUST_SERVICE_ID")); if(customerValue
	 * ==null) return null; } //String[] cycle = CmCommonUtil.getCycleYYMM(startDate, endDate); TableVars tableVar = new
	 * TableVars(); tableVar.add("CM_GROUP_CONTACT_H", IBOCmCmxPartyContactHValue.S_DoneDate,
	 * condition.getAsString("START_DATE").substring(0, 4)); sql.append("select * from (").append("select t.*,rownum
	 * rownum_ from (").append("SELECT a.*,b.cust_id FROM {CM_GROUP_CONTACT_H} a ,cm_group_contact b WHERE a.cont_id
	 * =b.cont_id").append(") t").append(" where 1=1 "); if(condition.getAsString("MEMBER_TYPE")!=null &&
	 * !"".equals(condition.getAsString("MEMBER_TYPE"))) sql.append("and
	 * ").append(IBOCmCmxPartyContactHValue.S_MemberType).append("= :MemberType "); sql.append("and
	 * ").append(ICustomerValue.S_CustId).append("= :Custid ") .append("and
	 * ").append(IBOCmCmxPartyContactHValue.S_DoneDate).append(">=to_date( :StartDate ,'YYYY-MM-DD')") .append("and
	 * ").append(IBOCmCmxPartyContactHValue.S_DoneDate).append("<=to_date( :EndDate ,'YYYY-MM-DD')") .append(")");
	 * if(startNum >0) { sql.append("where rownum_ >= :startNum "); if(endNum>0) sql.append("and rownum_<= :endNum "); }
	 * else if(endNum>0) { sql.append("where rownum_<= :endNum "); } HashMap<Object,Object> parameter =new
	 * HashMap<Object,Object>();
	 * if(condition.getAsString("MEMBER_TYPE")!=null && !"".equals(condition.getAsString("MEMBER_TYPE")))
	 * parameter.put("MemberType", condition.getAsString("MEMBER_TYPE")); parameter.put("Custid",
	 * customerValue.getCustId()); parameter.put("StartDate", condition.getAsString("START_DATE"));
	 * parameter.put("EndDate", condition.getAsString("END_DATE")); parameter.put("startNum", startNum);
	 * parameter.put("endNum", endNum); DataContainerInterface[] returnValues=CmInnerServiceFactory.getCommonInnerSV()
	 * .getBeansFromSql(BOCmCmxPartyContactHBean.class, SplitTableFactory.createQuerySQL(sql.toString(), tableVar),
	 * parameter); for(DataContainerInterface value:returnValues) { value.initProperty("CUST_SERVICE_ID",
	 * customerValue.getCustServiceId()); value.initProperty("CUST_NAME", customerValue.getCustName()); } return
	 * returnValues; }
	 */

	public DataContainerInterface[] queryData(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition = dcs[0];

		ICustomerValue customerValue = null;
		StringBuilder sql = new StringBuilder("");

		if (condition.getAsString("CUST_SERVICE_ID") != null && !"".equals(condition.getAsString("CUST_SERVICE_ID"))) {
			customerValue = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(condition.getAsString("CUST_SERVICE_ID"), CmConstants.CustomerType.GROUP);
			if (customerValue == null)
				ExceptionUtil.throwBusinessException("CMS90200104");
		}
		// String[] cycle = CmCommonUtil.getCycleYYMM(startDate, endDate);
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_CONTACT_H", IBOCmGroupContactHValue.S_DoneDate, condition.getAsString("EFFECTIVE_DATE").substring(0, 4));

		sql.append("select * from (").append("select t.* from (").append("SELECT a.* FROM {CM_GROUP_CONTACT_H} a ").append(") t").append(" where 1=1 ");
		if (condition.getAsString("MEMBER_TYPE") != null && !"".equals(condition.getAsString("MEMBER_TYPE")))
			sql.append("and ").append(IBOCmGroupContactHValue.S_MemberType).append("= :MemberType ");

		sql.append("and ").append(ICustomerValue.S_CustId).append("= :Custid ").append("and ").append(IBOCmGroupContactHValue.S_DoneDate)
				.append(">=DATE_FORMAT( :StartDate ,'%Y-%m-%d')").append("and ").append(IBOCmGroupContactHValue.S_DoneDate).append("<=DATE_FORMAT( :EndDate ,'%Y-%m-%d')")
				.append(")");

		if (startNum >= 0 && endNum >= 0) {
			sql.append(" LIMIT :startNum,:endNum ");
		}

		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		if (condition.getAsString("MEMBER_TYPE") != null && !"".equals(condition.getAsString("MEMBER_TYPE")))
			parameter.put("MemberType", condition.getAsString("MEMBER_TYPE"));
		if (customerValue != null) {
			parameter.put("Custid", customerValue.getCustId());
		}
		parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE"));
		parameter.put("EndDate", condition.getAsString("EXPIRE_DATE"));
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);

		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupContactHBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
		if (customerValue != null) {
			for (DataContainerInterface value : returnValues) {
				value.initProperty("CUST_SERVICE_ID", customerValue.getCustServiceId());
				value.initProperty("CUST_NAME", customerValue.getCustName());
			}
		}

		return returnValues;
	}

	public int queryDataCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(criteria);
		DataContainer condition = dcs[0];

		ICustomerValue customerValue = null;
		StringBuilder sql = new StringBuilder("");

		if (condition.getAsString("CUST_SERVICE_ID") != null && !"".equals(condition.getAsString("CUST_SERVICE_ID"))) {
			customerValue = CmServiceFactory.getCustomerSV().queryCustomerByServiceId(condition.getAsString("CUST_SERVICE_ID"), CmConstants.CustomerType.GROUP);
			if (customerValue == null)
				return 0;
		}

		TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_CONTACT_H", IBOCmGroupContactHValue.S_DoneDate, condition.getAsString("EFFECTIVE_DATE").substring(0, 4));

		sql.append("select count(*) as CNT from (").append("select t.* from (").append("SELECT a.* FROM {CM_GROUP_CONTACT_H} a ").append(") t").append(" where 1=1 ");

		if (condition.getAsString("MEMBER_TYPE") != null && !"".equals(condition.getAsString("MEMBER_TYPE")))
			sql.append("and ").append(IBOCmGroupContactHValue.S_MemberType).append("= :MemberType ");

		sql.append("and ").append(ICustomerValue.S_CustId).append("= :Custid ").append("and ").append(IBOCmGroupContactHValue.S_DoneDate)
				.append(">=DATE_FORMAT( :StartDate ,'%Y-%m-%d')").append("and ").append(IBOCmGroupContactHValue.S_DoneDate).append("<=DATE_FORMAT( :EndDate ,'%Y-%m-%d')")
				.append(")");

		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		if (condition.getAsString("MEMBER_TYPE") != null && !"".equals(condition.getAsString("MEMBER_TYPE")))
			parameter.put("MemberType", condition.getAsString("MEMBER_TYPE"));
		if (null != customerValue) {
			parameter.put("Custid", customerValue.getCustId());
		}
		parameter.put("StartDate", condition.getAsString("EFFECTIVE_DATE"));
		parameter.put("EndDate", condition.getAsString("EXPIRE_DATE"));

		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupContactHBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);

		return returnValues[0].getAsInt("CNT");
	}

	@Override
	public void saveData(DataContainer[] values) throws Exception {
		// 保存数据
	}

}
