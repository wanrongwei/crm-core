package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.common.bo.BOCmGroupInfoRelationHBean;
import com.asiainfo.crm.cm.common.bo.BoGroupArchivesMemberBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupInfoRelationHValue;
import com.asiainfo.crm.cm.common.ivalues.IBoGroupArchivesMemberHisValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupArchivesMemberHisSV;

public class CmGroupArchivesMemberHisSVImpl implements ICmGroupArchivesMemberHisSV {

	public int queryGroupArchivesMemberHisCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];

		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GA_MEMBER_GROUP_H", IBoGroupArchivesMemberHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));

		sql.append("SELECT count(*) as CNT FROM  (").append("SELECT t.* FROM {CM_GA_MEMBER_GROUP_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_DoneDate)
				.append(" >=DATE_FORMAT('" + condition.getAsString("DONE_START_DATE").substring(0, 10) + "' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_DoneDate)
				.append(" <=date_add(DATE_FORMAT('" + condition.getAsString("DONE_END_DATE").substring(0, 10) + "' ,'%Y-%m-%d'),interval 1 day)");

		if (condition.getAsString("MEMBER_NAME") != null && !"".equals(condition.getAsString("MEMBER_NAME"))) {
			sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_MemberName).append("= :memberName ");
			parameter.put("memberName", condition.getAsString("MEMBER_NAME"));
		}
		if (condition.getAsString("MEMBER_PHONE_ID") != null && !"".equals(condition.getAsString("MEMBER_PHONE_ID"))) {
			sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_MemberPhoneId).append("= :memberPhoneId ");
			parameter.put("memberPhoneId", condition.getAsString("MEMBER_PHONE_ID"));
		}
		if (condition.getAsString("GROUP_SEQ") != null && !"".equals(condition.getAsString("GROUP_SEQ"))) {
			sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_GroupSeq).append("= :groupSeq ");
			parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
		}
		sql.append(")");
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
		return returnValues[0].getAsInt("CNT");
	}

	public int queryGroupInfoRelationHCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_INFO_RELATION_H", IBOCmGroupInfoRelationHValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT count(*) as CNT FROM  (").append("SELECT t.* FROM {CM_GROUP_INFO_RELATION_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_DoneDate)
				.append(" >=DATE_FORMAT('" + condition.getAsString("DONE_START_DATE").substring(0, 10) + "' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_DoneDate)
				.append(" <=date_add(DATE_FORMAT('" + condition.getAsString("DONE_END_DATE").substring(0, 10) + "' ,'%Y-%m-%d'),interval 1 day)");

		if (condition.getAsString("GROUP_SEQ") != null && !"".equals(condition.getAsString("GROUP_SEQ"))) {
			sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_GroupSeq).append("= :groupseq ");
			parameter.put("groupseq", condition.getAsString("GROUP_SEQ"));
		}
		if (condition.getAsString("GROUP_ID") != null && !"".equals(condition.getAsString("GROUP_ID"))) {
			sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_GroupId).append("= :groupId ");
			parameter.put("groupId", condition.getAsString("GROUP_ID"));
		}
		sql.append(")");

		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
		return returnValues[0].getAsInt("CNT");
	}

	public DataContainer[] queryGroupArchivesMemberHis(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GA_MEMBER_GROUP_H", IBoGroupArchivesMemberHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_GA_MEMBER_GROUP_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_DoneDate)
				.append(" >=DATE_FORMAT('" + condition.getAsString("DONE_START_DATE").substring(0, 10) + "' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_DoneDate)
				.append(" <=date_add(DATE_FORMAT('" + condition.getAsString("DONE_END_DATE").substring(0, 10) + "' ,'%Y-%m-%d'),interval 1 day)");

		if (condition.getAsString("MEMBER_NAME") != null && !"".equals(condition.getAsString("MEMBER_NAME"))) {
			sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_MemberName).append("= :memberName ");
			parameter.put("memberName", condition.getAsString("MEMBER_NAME"));
		}
		if (condition.getAsString("MEMBER_PHONE_ID") != null && !"".equals(condition.getAsString("MEMBER_PHONE_ID"))) {
			sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_MemberPhoneId).append("= :memberPhoneId ");
			parameter.put("memberPhoneId", condition.getAsString("MEMBER_PHONE_ID"));
		}
		if (condition.getAsString("GROUP_SEQ") != null && !"".equals(condition.getAsString("GROUP_SEQ"))) {
			sql.append(" and ").append(IBoGroupArchivesMemberHisValue.S_GroupSeq).append("= :groupSeq ");
			parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
		}
		sql.append(")");
		if (startNum >= 0 && endNum >= 0) {
			sql.append(" limit :startNum,:endNum ");
		}
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BoGroupArchivesMemberBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);

		return (DataContainer[]) returnValues;
	}

	public DataContainer[] queryGroupInfoRelationH(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_INFO_RELATION_H", IBOCmGroupInfoRelationHValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_GROUP_INFO_RELATION_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_DoneDate)
				.append(" >=DATE_FORMAT('" + condition.getAsString("DONE_START_DATE").substring(0, 10) + "' ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_DoneDate)
				.append(" <=date_add(DATE_FORMAT('" + condition.getAsString("DONE_END_DATE").substring(0, 10) + "' ,'%Y-%m-%d'),interval 1 day)");

		if (condition.getAsString("GROUP_SEQ") != null && !"".equals(condition.getAsString("GROUP_SEQ"))) {
			sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_GroupSeq).append("= :groupseq ");
			parameter.put("groupseq", condition.getAsString("GROUP_SEQ"));
		}
		if (condition.getAsString("GROUP_ID") != null && !"".equals(condition.getAsString("GROUP_ID"))) {
			sql.append(" and ").append(IBOCmGroupInfoRelationHValue.S_GroupId).append("= :groupId ");
			parameter.put("groupId", condition.getAsString("GROUP_ID"));
		}
		sql.append(")");
		if (startNum >= 0 && endNum >= 0) {
			sql.append(" limit :startNum,:endNum ");
		}
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmGroupInfoRelationHBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
		return (DataContainer[]) returnValues;
	}

}
