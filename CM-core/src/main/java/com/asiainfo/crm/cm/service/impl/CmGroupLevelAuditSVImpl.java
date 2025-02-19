package com.asiainfo.crm.cm.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractGroupLevelAudit;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmGroupLevelAuditBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupLevelAuditValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupLevelAuditSV;

public class CmGroupLevelAuditSVImpl implements ICmGroupLevelAuditSV 
{

	public int queryDataCount(String criteria) throws Exception 
	{
		return ((AbstractGroupLevelAudit) CmServiceFactory.getBusiMode(AbstractGroupLevelAudit.class)).queryCount(criteria);
	}

	public DataContainer[] queryData(String criteria, int startNum,int endNum) throws Exception 
	{
		return ((AbstractGroupLevelAudit)CmServiceFactory.getBusiMode(AbstractGroupLevelAudit.class)).queryData(criteria, startNum, endNum);
	}

	public void saveData(DataContainer[] values) throws Exception 
	{
		for(DataContainer value:values)
		{
			if(value.isNew())
			{
				((BOCmGroupLevelAuditBean)value).setAuditId(CmCommonUtil.getNewSequence(BOCmGroupLevelAuditBean.class));
				setCommonValue(value);
			}
			else if(value.isModified())
			{
				//这里需要同步到cm_group_customer表
				if(CmLnConstants.GroupAuditSts.success.equals(value.getAsString(BOCmGroupLevelAuditBean.S_AuditSts)))
				{
					ICustomerValue queryValue=CmServiceFactory.getCustomerSV()
						.queryCustomerByServiceId(value.getAsString(BOCmGroupLevelAuditBean.S_GroupId), CmConstants.CustomerType.GROUP);
					if(queryValue !=null)
					{
						queryValue.initProperty(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
						queryValue.set(ICustomerValue.S_CustServiceLevel, Integer.parseInt(value.getAsString(BOCmGroupLevelAuditBean.S_NewValue)));
						CmServiceFactory.getCustomerSV().saveCustomer(queryValue);
					}
				}
			}
		}
		((AbstractGroupLevelAudit) CmServiceFactory.getBusiMode(AbstractGroupLevelAudit.class)).saveData(values);
	}
	
	private void setCommonValue(DataStructInterface dsi) throws Exception {
		ObjectType objectType = dsi.getObjectType();
		// 对于没有具体的BO类型的不处理
		if (objectType instanceof ObjectTypeNull) {
			return;
		}
		// 无任何值改变则跳过
		if (!dsi.isNew() && !dsi.isModified() && dsi.isDeleted()) {
			return;
		}
		Timestamp currDatetime = ServiceManager.getOpDateTime();
		if (dsi.isNew()) {
			// 创建时间
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_CreateDate) && dsi.get(BOCmGroupLevelAuditBean.S_CreateDate) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_CreateDate, currDatetime);
			}
			// 创建操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_CreateOpId) && dsi.get(BOCmGroupLevelAuditBean.S_CreateOpId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_CreateOpId, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_CreateOrgId) && dsi.get(BOCmGroupLevelAuditBean.S_CreateOrgId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_CreateOrgId, ServiceManager.getUser().getOrgId());
				}
			}
			// 地市
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_RegionId) && dsi.get(BOCmGroupLevelAuditBean.S_RegionId) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_RegionId, CmCommonUtil.getDefaultRegionId());
			}
			// 记录状态
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_State) && dsi.get(BOCmGroupLevelAuditBean.S_State) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_State, CmConstants.RecordState.USE);
			}
			// 失效时间
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_ExpireDate) && dsi.get(BOCmGroupLevelAuditBean.S_ExpireDate) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_ExpireDate, TimeUtil.getMaxExpire());
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_OpId) && dsi.get(BOCmGroupLevelAuditBean.S_OpId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_OpId, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_OrgId) && dsi.get(BOCmGroupLevelAuditBean.S_OrgId) == null) {
					dsi.set(BOCmGroupLevelAuditBean.S_OrgId, ServiceManager.getUser().getOrgId());
				}
			}
			// 业务流水号
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_DoneCode) && dsi.get(BOCmGroupLevelAuditBean.S_DoneCode) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_DoneCode, ServiceManager.getDoneCode());
			}
			// 当前业务操作时间
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_DoneDate) && dsi.get(BOCmGroupLevelAuditBean.S_DoneDate) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_DoneDate, currDatetime);
			}
			// 生效时间
			if (objectType.hasProperty(BOCmGroupLevelAuditBean.S_EffectiveDate) && dsi.get(BOCmGroupLevelAuditBean.S_EffectiveDate) == null) {
				dsi.set(BOCmGroupLevelAuditBean.S_EffectiveDate, currDatetime);
			}
		}
	}
	//查询审批记录
	public IBOCmGroupLevelAuditValue[] queryDataByCustId(long custId) throws Exception {
		HashMap parameter = new HashMap();
		StringBuilder condition = new StringBuilder(" 1=1 ");
		condition.append(" and ").append(IBOCmGroupLevelAuditValue.S_GroupId).append(" = :grpCust ");
		parameter.put("grpCust", custId);
		return (IBOCmGroupLevelAuditValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupLevelAuditBean.class, condition.toString(), parameter, -1, -1);
	}

}
