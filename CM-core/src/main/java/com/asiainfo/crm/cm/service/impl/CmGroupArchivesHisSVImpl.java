package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmGroupArchivesHisImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOGroupArchivesHisBean;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupArchivesHisValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupArchivesHisSV;

public class CmGroupArchivesHisSVImpl implements ICmGroupArchivesHisSV {

	public int queryGroupArchivesHisCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];

		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_ARCHIVES_H", IBOGroupArchivesHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));

		sql.append("SELECT count(*) as CNT FROM  (").append("SELECT t.* FROM {CM_GROUP_ARCHIVES_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" >=DATE_FORMAT('" + condition.getAsString("DONE_START_DATE").substring(0, 10) + "','%Y-%m-%d')");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate)
				.append(" <=date_add(DATE_FORMAT('" + condition.getAsString("DONE_END_DATE").substring(0, 10) + "','%Y-%m-%d'),interval 1 day)");

		if (condition.getAsString("GROUP_SEQ") != null && !"".equals(condition.getAsString("GROUP_SEQ"))) {
			sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupSeq).append("= :groupSeq ");
			parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
		}
		if (condition.getAsString("GROUP_NAME") != null && !"".equals(condition.getAsString("GROUP_NAME"))) {
			sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupName).append("= :groupName ");
			parameter.put("groupName", condition.getAsString("GROUP_NAME"));
		}
		if (condition.getAsString("OP_ID") != null && !"".equals(condition.getAsString("OP_ID"))) {
			sql.append(" and ").append(IBOGroupArchivesHisValue.S_OpId).append("= :opId ");
			parameter.put("opId", condition.getAsString("OP_ID"));
		}
		sql.append(")");
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);
		return returnValues[0].getAsInt("CNT");
	}

	public DataContainer[] queryGroupArchivesHis(String criteria, int startNum, int endNum) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer condition = dcs[0];
		StringBuilder sql = new StringBuilder("");
		HashMap<Object, Object> parameter = new HashMap<Object, Object>();
		TableVars tableVar = new TableVars();
		tableVar.add("CM_GROUP_ARCHIVES_H", IBOGroupArchivesHisValue.S_DoneDate, condition.getAsString("DONE_START_DATE").substring(0, 4));
		sql.append("SELECT * FROM  (").append("SELECT t.* FROM {CM_GROUP_ARCHIVES_H} T  WHERE 1= 1 ");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" >=DATE_FORMAT(:StartDate ,'%Y-%m-%d')");
		sql.append(" and ").append(IBOGroupArchivesHisValue.S_DoneDate).append(" <=date_add(DATE_FORMAT(:EndDate ,'%Y-%m-%d'),interval 1 day)");
		if (condition.getAsString("GROUP_SEQ") != null && !"".equals(condition.getAsString("GROUP_SEQ"))) {
			sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupSeq).append("= :groupSeq ");
			parameter.put("groupSeq", condition.getAsString("GROUP_SEQ"));
		}
		if (condition.getAsString("GROUP_NAME") != null && !"".equals(condition.getAsString("GROUP_NAME"))) {
			sql.append(" and ").append(IBOGroupArchivesHisValue.S_GroupName).append("= :groupName ");
			parameter.put("groupName", condition.getAsString("GROUP_NAME"));
		}
		if (condition.getAsString("OP_ID") != null && !"".equals(condition.getAsString("OP_ID"))) {
			sql.append(" and ").append(IBOGroupArchivesHisValue.S_OpId).append("= :opId ");
			parameter.put("opId", condition.getAsString("OP_ID"));
		}
		parameter.put("StartDate", condition.getAsString("DONE_START_DATE").substring(0, 10));
		parameter.put("EndDate", condition.getAsString("DONE_END_DATE").substring(0, 10));
		sql.append(")");
		if (startNum >= 0 && endNum >= 0) {
			sql.append(" limit :startNum,:endNum ");
		}
		parameter.put("startNum", startNum);
		parameter.put("endNum", endNum);
		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOGroupArchivesHisBean.class,
				SplitTableFactory.createQuerySQL(sql.toString(), tableVar), parameter);

		return (DataContainer[]) returnValues;
	}

	public void saveGroupArchivesHis(DataContainer[] values) throws Exception {
		((AbstractCmGroupArchivesHisImpl) CmServiceFactory.getBusiMode(AbstractCmGroupArchivesHisImpl.class)).saveGroupArchivesHis(values);
	}

}
