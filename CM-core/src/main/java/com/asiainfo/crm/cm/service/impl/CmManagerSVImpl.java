package com.asiainfo.crm.cm.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecGroupValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.manager.AbstractManagerQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.manager.AbstractOrganizeQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmMgrOperRelBean;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmOrganizeBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmManagerValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmMgrOperRelValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmMgrOrgRelValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmOrganizeValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmManagerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ISec2CmSV;

public class CmManagerSVImpl implements ICmManagerSV {

	public IBOCmManagerValue queryManagerById(long managerId) throws Exception {
		AbstractManagerQueryBusiModelImpl busiModel = (AbstractManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractManagerQueryBusiModelImpl.class);
		return (IBOCmManagerValue) busiModel.queryDataById(managerId);
	}

	public IBOCmOrganizeValue queryManagerOrganizeByMgrId(long managerId) throws Exception {
		AbstractOrganizeQueryBusiModelImpl busiModel = (AbstractOrganizeQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractOrganizeQueryBusiModelImpl.class);
		DataContainer condition = new DataContainer();
		condition.set(IBOCmMgrOrgRelValue.S_StaffId, managerId);
		condition.set(IBOCmMgrOrgRelValue.S_State, CmConstants.RecordState.USE);
		DataContainerInterface[] result = busiModel.queryData(new DataContainer[] { condition }, -1, -1);
		IBOCmOrganizeValue value = null;
		if (CmCommonUtil.isNotEmptyObject(result)) {
			value = new BOCmOrganizeBean();
			value.copy(result[0]);
		}
		return value;
	}

	public DataContainerInterface[] queryManagers(String criteria, int startNum, int endNum) throws Exception {
		AbstractManagerQueryBusiModelImpl busiModel = (AbstractManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractManagerQueryBusiModelImpl.class);
		return busiModel.queryData(criteria, startNum, endNum);
	}

	public int queryManagerCount(String criteria) throws Exception {
		AbstractManagerQueryBusiModelImpl busiModel = (AbstractManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractManagerQueryBusiModelImpl.class);
		return busiModel.queryCount(criteria);
	}

	public DataContainer[] queryManagersByIds(long[] managerIds) throws Exception {
		AbstractManagerQueryBusiModelImpl busiModel = (AbstractManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractManagerQueryBusiModelImpl.class);
		return busiModel.queryDataBatch(managerIds, -1, -1);
	}

	public IBOCmManagerValue queryManagerByOperCode(String operCode) throws Exception {
		ICmCommonInnerSV sv = CmInnerServiceFactory.getCommonInnerSV();
		DataContainer cdnDC = new DataContainer();
		cdnDC.set(IBOCmMgrOperRelValue.S_Code, operCode);
		cdnDC.set(IBOCmMgrOperRelValue.S_State, CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { cdnDC }, BOCmMgrOperRelBean.class);
		IBOCmMgrOperRelValue[] cmMgrOperRelValues = (IBOCmMgrOperRelValue[]) sv.getBeans(BOCmMgrOperRelBean.class, parameter.getCondition(), parameter.getParameter(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmMgrOperRelValues)) {
			return queryManagerById(cmMgrOperRelValues[0].getStaffId());
		}
		return null;
	}

	public IBOCmManagerValue queryManagerByOperId(long operId) throws Exception {
		ICmCommonInnerSV sv = CmInnerServiceFactory.getCommonInnerSV();
		DataContainer cdnDC = new DataContainer();
		cdnDC.set(IBOCmMgrOperRelValue.S_OperatorId, operId);
		cdnDC.set(IBOCmMgrOperRelValue.S_State, CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { cdnDC }, BOCmMgrOperRelBean.class);
		IBOCmMgrOperRelValue[] cmMgrOperRelValues = (IBOCmMgrOperRelValue[]) sv.getBeans(BOCmMgrOperRelBean.class, parameter.getCondition(), parameter.getParameter(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmMgrOperRelValues)) {
			return queryManagerById(cmMgrOperRelValues[0].getStaffId());
		}
		return null;
	}

	public IBOCmMgrOperRelValue queryMgrOperRelByManagerId(long managerId) throws Exception {
		ICmCommonInnerSV sv = CmInnerServiceFactory.getCommonInnerSV();
		DataContainer cdnDC = new DataContainer();
		cdnDC.set(IBOCmMgrOperRelValue.S_StaffId, managerId);
		cdnDC.set(IBOCmMgrOperRelValue.S_State, CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { cdnDC }, BOCmMgrOperRelBean.class);
		IBOCmMgrOperRelValue[] cmMgrOperRelValues = (IBOCmMgrOperRelValue[]) sv.getBeans(BOCmMgrOperRelBean.class, parameter.getCondition(), parameter.getParameter(), -1, -1);
		if (CmCommonUtil.isNotEmptyObject(cmMgrOperRelValues)) {
			return cmMgrOperRelValues[0];
		}
		return null;
	}

	public boolean isSameManager(long managerId, long operId) throws Exception {
		BOCmMgrOperRelBean cdn = new BOCmMgrOperRelBean();
		cdn.setStaffId(managerId);
		cdn.setOperatorId(operId);
		cdn.setState(CmConstants.RecordState.USE);
		Parameter parameter = ParamUtil.buildParameter(cdn, BOCmMgrOperRelBean.class);
		return (CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter()) > 0);
	}

	public ICustManagerValue queryGroupMainManager(long custId) throws Exception {
		ICustManagerValue result = null;
		ICustManagerValue[] custManagerValues = CmServiceFactory.getCustomerSV().queryCustManagersByCustId(custId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(custManagerValues)) {
			result = custManagerValues[0];
			// add by xialing,2013-8-23,增加客户经理信息查询和填充
			long managerId = result.getManagerId();
			ISec2CmSV iseCm = (ISec2CmSV) ServiceFactory.getService(ISec2CmSV.class);
			IQBOSecCustManagerValue secStaff = null;
			// 取得细分
			ICmCustSegmentRelaSV cmCustSegmentRelaSV = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
			IBOCmCustSegmentRelaValue BOCmCustSegmentRela = cmCustSegmentRelaSV.querySegmentRelaByCustId(custId);
			if (CmCommonUtil.isNotEmptyObject(BOCmCustSegmentRela)) {
				if (CmConstants.segment.SA.equals(String.valueOf(BOCmCustSegmentRela.getSegmentId()))) {
					// 客户经理组
					IBOSecGroupValue ibOrganizeValue = OrgmodelClient.getGroupValueByGroupId(managerId);
					if (ibOrganizeValue != null) {
						result.setManagerId(ibOrganizeValue.getGroupId());
						result.setStaffName(ibOrganizeValue.getGroupName());
						result.setBillId("");
						result.setOrganizeName(ibOrganizeValue.getGroupName());
						result.setOrganizeId(ibOrganizeValue.getOrgId());
					}
				} else {
					// 客户经理
					if (managerId > 0) {
						secStaff = iseCm.getEffectAmInfo(managerId, CmLnConstants.CM_MANAGER_TYPE.TYPE_3);
					}
					if (CmCommonUtil.isNotEmptyObject(secStaff)) {
						result.setStaffName(secStaff.getManagername());
						result.setOrganizeName(secStaff.getDeptname());
						result.setOrganizeId(secStaff.getOrgId());
						result.setBillId(secStaff.getBillid());
						result.setManagerId(secStaff.getManagerid());
					}
				}
			}
		}
		return result;
	}
}
