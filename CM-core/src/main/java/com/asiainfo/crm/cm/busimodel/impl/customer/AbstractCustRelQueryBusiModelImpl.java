/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractCustRelQueryBusiModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-11 上午11:26:32
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-11 LSC v1.0.0 修改原因
 */

package com.asiainfo.crm.cm.busimodel.impl.customer;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubActionBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.bo.GroupMemberBean;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;

public abstract class AbstractCustRelQueryBusiModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	/**
	 * 通过条件查询集团客户成员信息
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public final DataContainer[] queryData(DataContainer condition, int startNum, int endNum) throws Exception {
		Parameter parameter = buildQueryCondition(new DataContainer[] { condition }, BOCmGroupMemberBean.class);
		if (parameter == null) {
			parameter = ParamUtil.buildParameter(new DataContainer[] { condition }, BOCmGroupMemberBean.class);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmGroupMemberBean.class);
		}
		IBOCmGroupMemberValue[] boGroupMemberValue = (IBOCmGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
				parameter.getCondition(), parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(boGroupMemberValue)) {
			return new GroupMemberBean[0];
		}
		IGroupMemberValue[] custRelValue = new GroupMemberBean[boGroupMemberValue.length];
		for (int i = 0; i < custRelValue.length; i++) {
			custRelValue[i] = new GroupMemberBean();
			custRelValue[i].copy(boGroupMemberValue[i]);

		}
		return (DataContainer[]) custRelValue;
	}
	/**
	 * 通过条件查询集团客户成员信息
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public final int queryGroupMembersCount(DataContainer condition) throws Exception {
		Parameter parameter = buildQueryCondition(new DataContainer[] { condition }, BOCmGroupMemberBean.class);
		if (parameter == null) {
			parameter = ParamUtil.buildParameter(new DataContainer[] { condition }, BOCmGroupMemberBean.class);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmGroupMemberBean.class);
		}
		int boGroupMemberCount = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(),
				parameter.getCondition(), parameter.getParameter());
		
		return boGroupMemberCount;
	}
	/**
	 * 查询集团客户成员信息
	 * @param conditionDCs
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @Function: querygroupCustMemberValues
	 * @author: LSC
	 * @date: 2012-4-11 上午11:32:57 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-11       LSC         v1.0.0               修改原因
	 */
	public DataContainer[] querygroupCustMemberValueByCustId(long custId, int startNum, int endNum) throws Exception {
		BOCmGroupMemberBean bean = new BOCmGroupMemberBean();
		bean.setCustId(custId);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] {bean}, BOCmGroupMemberBean.class);
		IBOCmGroupMemberValue[] boGroupMemberValue = (IBOCmGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(),
				parameter.getCondition(), parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(boGroupMemberValue)) {
			return new GroupMemberBean[0];
		}
		GroupMemberBean[] groupMember = new GroupMemberBean[boGroupMemberValue.length];
		for (int i = 0; i < groupMember.length; i++) {
			groupMember[i] = new GroupMemberBean();
			groupMember[i].copy(boGroupMemberValue[i]);

		}
		return (DataContainer[]) groupMember;
	}

	/**
	 * 通过集团编码查询子集团信息
	 * @param groupId
	 * @param startNum
	 * @param endNum
	 * @return DataContainer[]
	 * @throws Exception
	 * @Function: queryGroupCustSonsByGroupId
	 * @author: LSC
	 * @date: 2012-4-13 下午1:16:48 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-13       LSC         v1.0.0               修改原因
	 */
	public DataContainer[] queryGroupCustSonsByGroupId(long groupId, int startNum, int endNum) throws Exception {
		CustomerBean condition = new CustomerBean();
		condition.setParentCustId(groupId);
		ICustomerValue[] groupCustomers = CmServiceFactory.getCustomerSV().queryCustomers(condition, startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(groupCustomers)) {
			return new CustomerBean[0];
		}
		return (DataContainer[]) groupCustomers;
	}

	protected abstract void afterQueryGroupMember(ICustRelationshipValue custRelValue, IBOCmGroupMemberValue groupMemValue) throws Exception;

	/**
	 * 构造查询条件
	 * @param conditionDCs
	 * @param clazz
	 * @return
	 * @throws Exception
	 * @Function: buildQueryCondition
	 * @author: LSC
	 * @date: 2012-4-11 下午12:29:14 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-11       LSC         v1.0.0               修改原因
	 */
	protected Parameter buildQueryCondition(DataContainer[] conditionDCs, Class clazz) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, clazz);
		StringBuilder condition = new StringBuilder();
		condition.append(BOCmClubActionBean.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
	
	protected Class getReturnObjectClass() {
		return CustRelationshipBean.class;
	}
}
